package com.cacophony.library.domain.event.flow.request;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.global.flow.request.FlowRequest;

public interface EventFlowRequest extends FlowRequest<EventActionParameter, EventTriggerParameter> {
    @Override
    EventActionParameter toActionParameter();

    @Override
    EventTriggerParameter toTriggerParameter();
}