package com.cacophony.library.domain.event.publisher;

import com.cacophony.library.domain.event.publisher.data.PublishEvent;
import com.cacophony.library.global.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class SimpleEventPublisher implements EventPublisher {
    private final List<Subscriber<PublishEvent>> subscribers = new ArrayList<>();

    @Override
    public void publish(PublishEvent data) {
        subscribers.forEach(subscriber -> subscriber.call(data));
    }

    @Override
    public void addSubscriber(Subscriber<PublishEvent> subscriber) {
        subscribers.add(subscriber);
    }
}
