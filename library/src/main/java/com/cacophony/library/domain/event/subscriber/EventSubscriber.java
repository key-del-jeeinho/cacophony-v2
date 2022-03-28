package com.cacophony.library.domain.event.subscriber;

import com.cacophony.library.domain.event.publisher.PublishEvent;
import com.cacophony.library.domain.subscriber.Subscriber;

public class EventSubscriber implements Subscriber<PublishEvent> {
    @Override
    public void call(PublishEvent data) {
        //TODO Flow 실행 로직 작성
    }
}
