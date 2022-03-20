package com.cacophony.library.domain.event.trigger;

import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public class SimpleEventTrigger implements EventTrigger {
    private final Function<EventTriggerParameter, Boolean> trigger;

    @Override
    public boolean check(EventTriggerParameter parameter) {
        return trigger.apply(parameter);
    }
}
