package com.cacophony.library.domain.event.trigger;

import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public class ImmutableEventTriggerBuilder implements EventTrigger.EventTriggerBuilder {
    private final Function<EventTriggerParameter, Boolean> function;

    public ImmutableEventTriggerBuilder() {
        this(null);
    }

    @Override
    public EventTrigger.EventTriggerBuilder trigger(Function<EventTriggerParameter, Boolean> function) {
        return new ImmutableEventTriggerBuilder(function);
    }

    @Override
    public EventTrigger build() {
        return new UnmodifiableEventTrigger(function);
    }
}
