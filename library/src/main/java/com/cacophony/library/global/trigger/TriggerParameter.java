package com.cacophony.library.global.trigger;

import com.cacophony.library.global.Parameter;

public interface TriggerParameter extends Parameter {
    @Override
    TriggerParameterBuilder builder();

    interface TriggerParameterBuilder extends ParameterBuilder {
        @Override
        TriggerParameter build();
    }
}
