package com.cacophony.library.domain.subscriber;

import com.cacophony.library.domain.publisher.PublishData;

public interface Subscriber {
    void call(PublishData data);
}
