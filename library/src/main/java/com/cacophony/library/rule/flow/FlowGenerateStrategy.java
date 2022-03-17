package com.cacophony.library.rule.flow;

import com.cacophony.library.global.GenerateStrategy;

@FunctionalInterface
public interface FlowGenerateStrategy extends GenerateStrategy<Flow>{
    Flow generate();
}
