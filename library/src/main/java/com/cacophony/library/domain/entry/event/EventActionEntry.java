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

    public static EventAction do_(Consumer<Event> function) {
        return complete(function);
    }

    private static EventAction complete(Consumer<Event> function) {
        return StaticEventConfiguration.generateAction()
                .builder()
                .function(parameter -> function.accept(parameter.getParameter("event", Event.class)))
                .build();
    }
}
