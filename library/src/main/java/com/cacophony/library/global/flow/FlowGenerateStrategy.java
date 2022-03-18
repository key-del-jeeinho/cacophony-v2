package com.cacophony.library.global.flow;

import com.cacophony.library.global.GenerateStrategy;

@FunctionalInterface
public interface FlowGenerateStrategy extends GenerateStrategy<Flow>{
    Flow generate();
}
