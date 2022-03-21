package com.cacophony.library.global.trigger.parameter;

import com.cacophony.library.global.common.GenerateStrategy;
import com.cacophony.library.global.common.SimpleGenerator;

public class TriggerParameterGenerator<T extends TriggerParameter<?>> extends SimpleGenerator<T> {
    public TriggerParameterGenerator(GenerateStrategy<T> generateStrategy) {
        super(generateStrategy);
    }
}
