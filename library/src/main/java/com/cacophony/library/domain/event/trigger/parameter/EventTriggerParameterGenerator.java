package com.cacophony.library.domain.event.trigger.parameter;

import com.cacophony.library.global.trigger.parameter.TriggerParameterGenerator;

public class EventTriggerParameterGenerator extends TriggerParameterGenerator<EventTriggerParameter> {
    public EventTriggerParameterGenerator(EventTriggerParameterGenerateStrategy generateStrategy) {
        super(generateStrategy);
    }
}
