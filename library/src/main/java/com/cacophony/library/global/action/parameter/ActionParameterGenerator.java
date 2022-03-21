package com.cacophony.library.global.action.parameter;

import com.cacophony.library.global.common.GenerateStrategy;
import com.cacophony.library.global.common.SimpleGenerator;

public class ActionParameterGenerator<T extends ActionParameter<?>> extends SimpleGenerator<T> {
    public ActionParameterGenerator(GenerateStrategy<T> generateStrategy) {
        super(generateStrategy);
    }
}
