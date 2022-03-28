package com.cacophony.library.domain.publisher;

import com.cacophony.library.domain.subscriber.Subscriber;

public interface SubscrablePublisher<T extends PublishData> extends Publisher<T>{
    void addSubscriber(Subscriber<T> subscriber);
}
