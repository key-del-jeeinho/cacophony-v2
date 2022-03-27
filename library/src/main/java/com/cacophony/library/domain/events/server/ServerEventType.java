package com.cacophony.library.domain.events.server;

import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ServerEventType implements EventType {
    MEMBER("member"), UPDATE("update");

    private final String object;

    @Override
    public String getGroupName() {
        return StandardEventType.SERVER_EVENT.getObjectName();
    }

    @Override
    public String getObjectName() {
        return object;
    }
}
