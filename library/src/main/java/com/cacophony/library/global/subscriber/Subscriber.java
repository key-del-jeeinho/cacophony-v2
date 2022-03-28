package com.cacophony.library.global.subscriber;

import com.cacophony.library.global.publisher.data.PublishData;

public interface Subscriber<T extends PublishData<?>> {
    void call(T data);
}
