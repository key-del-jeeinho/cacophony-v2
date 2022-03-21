package com.cacophony.library.global.flow;

import com.cacophony.library.global.common.GenerateStrategy;

@FunctionalInterface
public interface FlowGenerateStrategy<T extends Flow<?, ?>> extends GenerateStrategy<T>{
}
