package com.cacophony.library.global.flow.request;

import com.cacophony.library.global.common.GenerateStrategy;
import com.cacophony.library.global.common.SimpleGenerator;

public class FlowRequestGenerator<T extends FlowRequest<?, ?>> extends SimpleGenerator<T> {
    public FlowRequestGenerator(GenerateStrategy<T> generateStrategy) {
        super(generateStrategy);
    }
}
