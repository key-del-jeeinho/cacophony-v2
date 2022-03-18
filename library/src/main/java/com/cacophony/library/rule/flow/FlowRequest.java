package com.cacophony.library.rule.flow;

import com.cacophony.library.rule.action.ActionParameter;
import com.cacophony.library.rule.trigger.TriggerParameter;

public interface FlowRequest {
    ActionParameter toActionParameter();
    TriggerParameter toTriggerParameter();
}
