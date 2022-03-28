package com.cacophony.library.domain.entry.event;

import com.cacophony.library.domain.entry.event.builder.*;
import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.common.manager.StaticEventManager;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.global.Buildable;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;
import java.util.function.Function;

@RequiredArgsConstructor
//on().and().and().doAction().and().and().complete();
//do_().and().and().when().and().and().complete();
public abstract class EventFlowEntry implements Buildable<EventFlow> {
    protected final EventAction action;
    protected final EventTrigger trigger;

    public static <T extends Event> EventFlowEntryTriggerBuilder on(Class<T> event) {
        return generate(parameter -> then(event).check(parameter), (EventAction) null);
    }
    public static EventFlowEntryActionBuilder do_(Consumer<Event> doWhat) {
        return generate(convert().andThen(just(doWhat))::apply, null);
    }
    public static <T extends Event> EventFlowEntryActionBuilder do_(Consumer<T> doWhat, Class<T> clazz) {
        return generate(convert().andThen(clazz::cast).andThen(just(doWhat))::apply, null);
    }
    protected static Function<EventActionParameter, Event> convert() {
        return parameter -> parameter.getParameter("event", Event.class);
    }
    protected static <T extends Event> EventTrigger then(Class<T> event) {
        return StaticEventManager.trigger()
                .builder()
                .trigger(parameter -> event.isInstance(parameter.getParameter("event", Event.class)))
                .build();
    }

    protected static EventFlowEntryTriggerBuilder generate(Function<EventTriggerParameter, Boolean> function, EventAction action) {
        EventTrigger trigger = StaticEventManager.trigger()
                .builder()
                .trigger(function)
                .build();
        if(trigger != null) return new BuildableEventFlowEntryTriggerBuilder(action, trigger);
        return new UncompletableEventFlowEntryTriggerBuilder(action, null);
    }
    protected static EventFlowEntryActionBuilder generate(Consumer<EventActionParameter> function, EventTrigger trigger) {
        EventAction action = StaticEventManager.action()
                .builder()
                .function(function)
                .build();
        if(trigger != null) return new BuildableEventFlowEntryActionBuilder(action, trigger);
        return new UncompletableEventFlowEntryActionBuilder(action, null);
    }

    //TODO FunctionalConverter 라이브러리 만들고 적용하기
    protected static <T> Function<T, T> just(Consumer<T> consumer) {
        return arg -> {
            consumer.accept(arg);
            return arg;
        };
    }
}
