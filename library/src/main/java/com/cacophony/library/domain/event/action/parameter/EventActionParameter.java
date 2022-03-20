package com.cacophony.library.domain.event.action.parameter;

import com.cacophony.library.global.action.ActionParameter;
import com.cacophony.library.global.events.Event;

public interface EventActionParameter extends ActionParameter<EventActionParameter.EventActionParameterBuilder> {
    interface EventActionParameterBuilder extends ActionParameter.ActionParameterBuilder {
        EventActionParameter.EventActionParameterBuilder event(Event event);

        EventActionParameter build();
    }
}
