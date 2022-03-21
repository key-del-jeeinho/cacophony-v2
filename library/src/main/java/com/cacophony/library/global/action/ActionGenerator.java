package com.cacophony.library.global.action;

import com.cacophony.library.global.common.GenerateStrategy;
import com.cacophony.library.global.common.SimpleGenerator;

public class ActionGenerator<T extends Action<?>> extends SimpleGenerator<T> {
    public ActionGenerator(GenerateStrategy<T> generateStrategy) {
        super(generateStrategy);
    }
}
