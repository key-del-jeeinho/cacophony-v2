package com.cacophony.library.global.action;

import com.cacophony.library.global.common.Parameter;

public interface ActionParameter extends Parameter {
    @Override
    ActionParameterBuilder builder();

    interface ActionParameterBuilder extends ParameterBuilder {
        @Override
        ActionParameter build();
    }
}
