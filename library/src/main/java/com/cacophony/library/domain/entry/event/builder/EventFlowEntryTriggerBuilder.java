package com.cacophony.library.domain.entry.event.builder;

import com.cacophony.library.domain.entry.event.EventFlowEntry;
import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.trigger.EventTrigger;

import java.util.function.Consumer;

public abstract class EventFlowEntryTriggerBuilder extends EventFlowEntry {
    public EventFlowEntryTriggerBuilder(EventAction action, EventTrigger trigger) {
        super(action, trigger);
    }

    public <X extends Event> EventFlowEntryTriggerBuilder and(Class<X> event) {
        return generate(parameter -> trigger.check(parameter) || then(event).check(parameter), action);
    }

    public BuildableEventFlowEntryActionBuilder doAction(Consumer<Event> doWhat) {
        return (BuildableEventFlowEntryActionBuilder) generate(convert().andThen(just(doWhat))::apply, trigger);
    }

    public <T extends Event> BuildableEventFlowEntryActionBuilder doAction(Consumer<T> doWhat, Class<T> clazz) {
        return (BuildableEventFlowEntryActionBuilder) generate(convert().andThen(clazz::cast).andThen(just(doWhat))::apply, trigger);
    }
}
