package com.cacophony.library.global.trigger;

import com.cacophony.library.global.common.Parameter;

public interface TriggerParameter<T extends TriggerParameter.TriggerParameterBuilder> extends Parameter<T> {
    interface TriggerParameterBuilder extends ParameterBuilder {
        @Override
        TriggerParameter<?> build();
    }
}
