package com.cacophony.library.domain.event.publisher;

public class SingletonEventPublisherGenerator extends EventPublisherGenerator{
    public SingletonEventPublisherGenerator(EventPublisherGenerateStrategy generateStrategy) {
        super(new LazyInitSingletonEventPublisherGenerateStrategy(generateStrategy));
    }
}
