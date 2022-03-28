package com.cacophony.library.domain.event.publisher;

import com.cacophony.library.domain.publisher.PublishData;
import com.cacophony.library.domain.publisher.Publisher;
import com.cacophony.library.domain.publisher.SubscrablePublisher;
import com.cacophony.library.domain.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class EventPublisher implements SubscrablePublisher<PublishEvent> {
    List<Subscriber<PublishEvent>> subscribers = new ArrayList<>();

    @Override
    public void publish(PublishEvent data) {
        subscribers.forEach(subscriber -> subscriber.call(data));
    }

    @Override
    public void addSubscriber(Subscriber<PublishEvent> subscriber) {
        subscribers.add(subscriber);
    }
}
