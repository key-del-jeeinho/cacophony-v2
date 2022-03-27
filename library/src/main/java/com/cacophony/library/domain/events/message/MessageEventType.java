package com.cacophony.library.domain.events.message;

import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MessageEventType implements EventType {
    CREATE("create"), UPDATE("update"), DELETE("delete");

    private final String object;

    @Override
    public String getGroupName() {
        return StandardEventType.MESSAGE_EVENT.getObjectName();
    }

    @Override
    public String getObjectName() {
        return object;
    }
}
