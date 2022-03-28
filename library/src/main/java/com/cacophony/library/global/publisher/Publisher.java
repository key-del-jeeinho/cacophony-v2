package com.cacophony.library.global.publisher;

import com.cacophony.library.global.publisher.data.PublishData;

public interface Publisher<T extends PublishData<?>> {
    void publish(T data);
}
