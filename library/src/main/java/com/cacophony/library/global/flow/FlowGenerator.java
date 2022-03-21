package com.cacophony.library.global.flow;

import com.cacophony.library.global.common.GenerateStrategy;
import com.cacophony.library.global.common.SimpleGenerator;

public class FlowGenerator<T extends Flow<?, ?>> extends SimpleGenerator<T> {
    public FlowGenerator(GenerateStrategy<T> generateStrategy) {
        super(generateStrategy);
    }
}
