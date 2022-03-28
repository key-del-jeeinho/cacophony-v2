package com.cacophony.library.domain.entry.event;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.common.manager.StaticEventManager;
import com.cacophony.library.domain.event.common.data.Event;

import java.util.function.Consumer;

@Deprecated
public class EventActionEntry {
    public static EventAction do_(Consumer<Event> function) {
        return complete(function);
    }

    private static EventAction complete(Consumer<Event> function) {
        return StaticEventManager.action()
                .builder()
                .function(parameter -> function.accept(parameter.getParameter("event", Event.class)))
                .build();
    }
}
