package com.cacophony.library.domain.subscriber;

import com.cacophony.library.domain.publisher.PublishData;

public interface Subscriber<T extends PublishData> {
    void call(T data);
}
