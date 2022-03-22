package com.cacophony.library.domain.entry.event;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.common.configuration.StaticEventConfiguration;
import com.cacophony.library.domain.event.common.data.Event;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class EventActionEntry {
    private final Consumer<Event> function;

    public static EventAction doActionComplete(Consumer<Event> function) {
        return complete(function);
    }

    public static EventActionEntry doAction(Consumer<Event> function) {
        return generate(function);
    }

    public EventActionEntry and(Consumer<Event> function) {
        return generate(this.function.andThen(function));
    }

    public EventAction complete() {
        return complete(function);
    }

    private static EventAction complete(Consumer<Event> function) {
        return StaticEventConfiguration.generateAction()
                .builder()
                .function(parameter -> function.accept(getEvent(parameter)))
                .build();
    }

    private static EventActionEntry generate(Consumer<Event> function) {
        return new EventActionEntry(function);
    }

    private static Event getEvent(EventActionParameter parameter) {
        return parameter.getParameter("event", Event.class);
    }
}
