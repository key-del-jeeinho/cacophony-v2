package com.cacophony.library.domain.publisher;

public interface Publisher<T extends PublishData> {
    void publish(T data);
}
