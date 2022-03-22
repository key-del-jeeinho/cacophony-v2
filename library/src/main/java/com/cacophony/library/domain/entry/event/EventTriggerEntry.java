package com.cacophony.library.domain.entry.event;

import com.cacophony.library.domain.event.common.configuration.StaticEventConfiguration;
import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public class EventTriggerEntry {
    private final Function<EventTriggerParameter, EventTriggerParameter> function;

    public static <T extends Event> EventTrigger onComplete(Class<T> event) {
        return complete(first().andThen(then(event)));
    }

    public static <T extends Event> EventTriggerEntry on(Class<T> event) {
        return generate(first(), event);
    }

    public <T extends Event> EventTriggerEntry and(Class<T> event) {
        return generate(function, event);
    }

    public EventTrigger complete() {
        return complete(function);
    }

    private static Function<EventTriggerParameter, EventTriggerParameter> first() {
        return parameter -> parameter.addParameter("isTriggerActivated", false);
    }

    private static <T extends Event> Function<EventTriggerParameter, EventTriggerParameter> then(Class<T> event) {
        return parameter -> {
            if(parameter.getParameter("isTriggerActivated", Boolean.class)) return parameter;
            if(event.isInstance(parameter.getParameter("event")))
                parameter.addParameter("isTriggerActivated", true);
            return parameter;
        };
    }

    private static EventTrigger complete(Function<EventTriggerParameter, EventTriggerParameter> function) {
        return StaticEventConfiguration.generateTrigger()
                .builder()
                .trigger(function.andThen(parameter -> parameter.getParameter("isTriggerActivated", Boolean.class)))
                .build();
    }

    private static <T extends Event> EventTriggerEntry generate(Function<EventTriggerParameter, EventTriggerParameter> origin, Class<T> event) {
        return new EventTriggerEntry(origin.andThen(then(event)));
    }
}
