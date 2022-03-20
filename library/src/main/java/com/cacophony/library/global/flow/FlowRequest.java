package com.cacophony.library.global.flow;

import com.cacophony.library.global.action.ActionParameter;
import com.cacophony.library.global.trigger.TriggerParameter;

public interface FlowRequest<A extends ActionParameter<?>, T extends TriggerParameter<?>> {
    A toActionParameter();
    T toTriggerParameter();
}
