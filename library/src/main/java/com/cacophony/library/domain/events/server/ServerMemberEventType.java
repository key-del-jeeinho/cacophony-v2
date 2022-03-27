package com.cacophony.library.domain.events.server;

import com.cacophony.library.domain.event.common.data.EventType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ServerMemberEventType implements EventType {
    JOIN("join"), QUIT("quit"), BAN("ban"), UNBAN("unban");

    private final String object;

    @Override
    public String getGroupName() {
        return ServerEventType.MEMBER.getGroupName() + "-" + ServerEventType.MEMBER.getObjectName();
    }

    @Override
    public String getObjectName() {
        return object;
    }
}
