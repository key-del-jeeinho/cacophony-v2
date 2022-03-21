package com.cacophony.library.domain.event.trigger;

import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public class ImmutableEventTrigger implements EventTrigger {
    private final Function<EventTriggerParameter, Boolean> function;

    public ImmutableEventTrigger() {
        this(null);
    }

    @Override
    public boolean check(EventTriggerParameter parameter) {
        return function.apply(parameter);
    }

    @Override
    public EventTriggerBuilder builder() {
        return new ImmutableEventTriggerBuilder();
    }
}
