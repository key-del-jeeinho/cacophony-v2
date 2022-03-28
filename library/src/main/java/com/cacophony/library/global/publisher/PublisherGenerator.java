package com.cacophony.library.global.publisher;

import com.cacophony.library.global.common.GenerateStrategy;
import com.cacophony.library.global.common.SimpleGenerator;

public class PublisherGenerator<T extends Publisher<?>> extends SimpleGenerator<T> {
    public PublisherGenerator(GenerateStrategy<T> generateStrategy) {
        super(generateStrategy);
    }
}
