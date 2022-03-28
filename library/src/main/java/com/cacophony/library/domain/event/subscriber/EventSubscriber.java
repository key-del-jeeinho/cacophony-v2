package com.cacophony.library.domain.event.subscriber;

import com.cacophony.library.domain.event.publisher.data.PublishEvent;
import com.cacophony.library.global.subscriber.Subscriber;

public interface EventSubscriber extends Subscriber<PublishEvent> {
    void call(PublishEvent data);

    EventSubscriberBuilder builder();

    interface EventSubscriberBuilder extends SubscriberBuilder<EventSubscriber> {
    }
}
