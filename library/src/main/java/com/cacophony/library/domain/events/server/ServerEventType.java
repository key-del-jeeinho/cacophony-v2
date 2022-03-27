package com.cacophony.library.domain.events.server;

import com.cacophony.library.domain.event.common.data.EventType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ServerEventType implements EventType {
    SERVER_EVENT("server"),
    MEMBER_EVENT("member"),
    ROLE_EVENT("role"),
    MEMBER_ROLE_EVENT("member-role");

    private final String object;


    @Override
    public String getGroupName() {
        return "server";
    }

    @Override
    public String getObjectName() {
        return object;
    }
}
