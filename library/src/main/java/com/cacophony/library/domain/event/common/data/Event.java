package com.cacophony.library.domain.event.common.data;

public interface Event {
    EventType getType();
    EventOperation getOperation();
}
