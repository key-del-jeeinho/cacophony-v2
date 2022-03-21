package com.cacophony.library.domain.event.action.parameter;

import com.cacophony.library.global.action.parameter.ActionParameterGenerator;

public class EventActionParameterGenerator extends ActionParameterGenerator<EventActionParameter> {
    public EventActionParameterGenerator(EventActionParameterGenerateStrategy generateStrategy) {
        super(generateStrategy);
    }
}
