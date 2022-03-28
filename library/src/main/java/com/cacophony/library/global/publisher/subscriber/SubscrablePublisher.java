package com.cacophony.library.global.publisher.subscriber;

import com.cacophony.library.global.publisher.Publisher;
import com.cacophony.library.global.publisher.data.PublishData;
import com.cacophony.library.global.subscriber.Subscriber;

public interface SubscrablePublisher<T extends PublishData<?>> extends Publisher<T> {
    void addSubscriber(Subscriber<T> subscriber);
}
