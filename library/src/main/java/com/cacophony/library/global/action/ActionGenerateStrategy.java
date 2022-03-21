package com.cacophony.library.global.action;

import com.cacophony.library.global.common.GenerateStrategy;

@FunctionalInterface
public interface ActionGenerateStrategy<T extends Action<?>> extends GenerateStrategy<T> {
}
