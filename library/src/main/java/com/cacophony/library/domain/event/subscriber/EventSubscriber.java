package com.cacophony.library.domain.event.subscriber;

import com.cacophony.library.domain.event.publisher.PublishEvent;
import com.cacophony.library.domain.subscriber.Subscriber;

public abstract class EventSubscriber implements Subscriber<PublishEvent> {
    @Override
    public abstract void call(PublishEvent data);
}
