package com.cacophony.library.domain.event.common.configuration;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.flow.request.EventFlowRequest;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;

public interface EventConfiguration {
    EventAction generateAction();
    EventActionParameter generateActionParameter();
    EventFlow generateFlow();
    EventFlowRequest generateFlowRequest();
    EventTrigger generateTrigger();
    EventTriggerParameter generateTriggerParameter();
}
