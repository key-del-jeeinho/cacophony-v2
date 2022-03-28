package com.cacophony.library.domain.publisher;

import com.cacophony.library.domain.subscriber.Subscriber;

public interface SubscrablePublisher {
    void addSubscriber(Subscriber subscriber);
}
