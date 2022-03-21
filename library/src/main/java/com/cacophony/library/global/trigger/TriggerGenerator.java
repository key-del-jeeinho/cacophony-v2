package com.cacophony.library.global.trigger;

import com.cacophony.library.global.common.GenerateStrategy;
import com.cacophony.library.global.common.SimpleGenerator;

public class TriggerGenerator<T extends Trigger<?>> extends SimpleGenerator<T> {
    public TriggerGenerator(GenerateStrategy<T> generateStrategy) {
        super(generateStrategy);
    }
}
