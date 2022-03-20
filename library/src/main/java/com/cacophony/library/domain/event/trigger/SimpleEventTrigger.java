package com.cacophony.library.domain.event.trigger;

import com.cacophony.library.global.trigger.TriggerParameter;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public class SimpleEventTrigger implements EventTrigger {
    private final Function<TriggerParameter, Boolean> trigger;

    @Override
    public boolean check(TriggerParameter parameter) {
        return trigger.apply(parameter);
    }
}
