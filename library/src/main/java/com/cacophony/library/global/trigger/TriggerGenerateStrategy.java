package com.cacophony.library.global.trigger;

import com.cacophony.library.global.common.GenerateStrategy;

@FunctionalInterface
public interface TriggerGenerateStrategy<T extends Trigger<?>>  extends GenerateStrategy<T> {
}
