package com.cacophony.library.domain.event.flow;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.global.flow.FlowRequest;

public interface EventFlowRequest extends FlowRequest {
    @Override
    EventActionParameter toActionParameter();

    @Override
    EventTriggerParameter toTriggerParameter();
}