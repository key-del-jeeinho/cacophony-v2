package com.cacophony.library.domain.event.publisher;

public class LazyInitSingletonEventPublisherGenerateStrategy implements EventPublisherGenerateStrategy {
    private final EventPublisherGenerateStrategy generateStrategy;
    private EventPublisher publisher;

    public LazyInitSingletonEventPublisherGenerateStrategy(EventPublisherGenerateStrategy generateStrategy) {
        this.generateStrategy = generateStrategy;
    }

    @Override
    public EventPublisher generate() {
        if(publisher == null) publisher = generateStrategy.generate();
        return publisher;
    }
}
