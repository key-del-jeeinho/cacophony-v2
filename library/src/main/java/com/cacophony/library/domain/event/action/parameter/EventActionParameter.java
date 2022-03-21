package com.cacophony.library.domain.event.action.parameter;

import com.cacophony.library.global.action.parameter.ActionParameter;
import com.cacophony.library.domain.event.common.Event;

public interface EventActionParameter extends ActionParameter<EventActionParameter.EventActionParameterBuilder> {
    interface EventActionParameterBuilder extends ActionParameter.ActionParameterBuilder {
        EventActionParameter.EventActionParameterBuilder event(Event event);

        EventActionParameter build();
    }
}
