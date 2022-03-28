package com.cacophony.library.domain.entry.event;

import com.cacophony.library.domain.event.common.configuration.StaticEventConfiguration;
import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;

import java.util.function.Function;

@Deprecated
public class EventTriggerEntry {
    public static <T extends Event> EventTrigger on(Class<T> event) {
        return complete(first().andThen(then(event)));
    }

    private static Function<EventTriggerParameter, EventTriggerParameter> first() {
        return parameter -> parameter.addParameter("isTriggerActivated", false);
    }

    private static <T extends Event> Function<EventTriggerParameter, EventTriggerParameter> then(Class<T> event) {
        return parameter -> parameter.addParameter("isTriggerActivated",
                parameter.getParameter("isTriggerActivated", Boolean.class)
                        ||event.isInstance(parameter.getParameter("event")));
    }

    private static EventTrigger complete(Function<EventTriggerParameter, EventTriggerParameter> function) {
        return StaticEventConfiguration.trigger()
                .builder()
                .trigger(function.andThen(parameter -> parameter.getParameter("isTriggerActivated", Boolean.class)))
                .build();
    }
}
