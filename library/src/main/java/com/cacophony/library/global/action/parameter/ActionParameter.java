package com.cacophony.library.global.action.parameter;

import com.cacophony.library.global.common.Parameter;

public interface ActionParameter<B extends ActionParameter.ActionParameterBuilder> extends Parameter<B> {
    interface ActionParameterBuilder extends ParameterBuilder {
        @Override
        ActionParameter<?> build();
    }
}
