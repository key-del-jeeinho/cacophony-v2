package com.cacophony.library.domain.event.publisher;

import com.cacophony.library.global.common.GenerateStrategy;
import com.cacophony.library.global.publisher.PublisherGenerator;

public class EventPublisherGenerator extends PublisherGenerator<EventPublisher> {
    public EventPublisherGenerator(EventPublisherGenerateStrategy generateStrategy) {
        super(generateStrategy);
    }
}
