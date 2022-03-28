package com.cacophony.library.domain.event.subscriber;

import com.cacophony.library.domain.event.publisher.data.PublishEvent;
import com.cacophony.library.global.subscriber.Subscriber;

public abstract class EventSubscriber implements Subscriber<PublishEvent> {
    @Override
    public abstract void call(PublishEvent data);
}
