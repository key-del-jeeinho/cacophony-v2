package com.cacophony.library.domain.event.publisher;

import com.cacophony.library.domain.event.publisher.data.PublishEvent;
import com.cacophony.library.global.publisher.subscriber.SubscrablePublisher;
import com.cacophony.library.global.subscriber.Subscriber;

public interface EventPublisher extends SubscrablePublisher<PublishEvent> {
    @Override
    void publish(PublishEvent data);
    @Override
    void addSubscriber(Subscriber<PublishEvent> subscriber);
}
