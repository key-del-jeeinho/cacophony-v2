package com.cacophony.library.domain.event.trigger;

import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.global.trigger.Trigger;

import java.util.function.Function;

public interface EventTrigger extends Trigger<EventTriggerParameter> {
    @Override
    EventTriggerBuilder builder();

    interface EventTriggerBuilder extends TriggerBuilder<EventTrigger> {
        EventTriggerBuilder trigger(Function<EventTriggerParameter, Boolean> function);
    }
}
