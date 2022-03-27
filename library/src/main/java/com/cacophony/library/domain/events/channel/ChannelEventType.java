package com.cacophony.library.domain.events.channel;

import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ChannelEventType implements EventType {
    CREATE("create"), UPDATE("update"), DELETE("delete");

    private final String object;

    @Override
    public String getGroupName() {
        return StandardEventType.CHANNEL_EVENT.getObjectName();
    }

    @Override
    public String getObjectName() {
        return object;
    }
}
