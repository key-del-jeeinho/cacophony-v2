package com.cacophony.library.domain.event.subscriber;

import com.cacophony.library.global.common.GenerateStrategy;
import com.cacophony.library.global.common.SimpleGenerator;

public class EventSubscriberGenerator extends SimpleGenerator<EventSubscriber> {
    public EventSubscriberGenerator(GenerateStrategy<EventSubscriber> generateStrategy) {
        super(generateStrategy);
    }
}
