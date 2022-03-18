package com.cacophony.library.event.flow;

import com.cacophony.library.event.trigger.EventTriggerParameter;
import com.cacophony.library.global.action.ActionParameter;
import com.cacophony.library.global.flow.FlowRequest;

public interface EventFlowRequest extends FlowRequest {
    @Override //TODO event.action 레벨 구현 이후 EventTriggerParameter 로 변경예정
    ActionParameter toActionParameter();

    @Override
    EventTriggerParameter toTriggerParameter();
}