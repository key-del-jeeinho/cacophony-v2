package com.cacophony.library.global.subscriber;

import com.cacophony.library.global.common.GenerateStrategy;
import com.cacophony.library.global.common.SimpleGenerator;

public class SubscriberGenerator<T extends Subscriber<?>> extends SimpleGenerator<T> {
    public SubscriberGenerator(GenerateStrategy<T> generateStrategy) {
        super(generateStrategy);
    }
}
