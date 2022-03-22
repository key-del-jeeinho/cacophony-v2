package com.cacophony.library.domain.event.common.data;

public interface EventType {
    default String getName() {
        return String.format("%s:%s-event", getGroupName(), getObjectName());
    }

    String getGroupName();
    String getObjectName();
}
