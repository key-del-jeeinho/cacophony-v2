package com.cacophony.library.global.flow.request;

import com.cacophony.library.global.action.parameter.ActionParameter;
import com.cacophony.library.global.trigger.parameter.TriggerParameter;

public interface FlowRequest<A extends ActionParameter<?>, T extends TriggerParameter<?>> {
    A toActionParameter();
    T toTriggerParameter();

    FlowRequestBuilder<?> builder();

    interface FlowRequestBuilder<T extends FlowRequest<?, ?>> {
        T build();
    }
}
