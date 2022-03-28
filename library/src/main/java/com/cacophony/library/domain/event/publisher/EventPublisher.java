package com.cacophony.library.domain.event.publisher;

import com.cacophony.library.domain.publisher.SubscrablePublisher;
import com.cacophony.library.domain.subscriber.Subscriber;

public abstract class EventPublisher implements SubscrablePublisher<PublishEvent> {

    @Override
    public abstract void publish(PublishEvent data);

    @Override
    public abstract void addSubscriber(Subscriber<PublishEvent> subscriber);
}
