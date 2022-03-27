package com.cacophony.library.domain.event.common.data;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StandardEventType implements EventType{
    BOT_EVENT("bot"),
    USER_EVENT("user"),
    MESSAGE_EVENT("message"),
    SERVER_EVENT("server"),
    CHANNEL_EVENT("channel"),
    ROLE_EVENT("role"),
    REACT_EVENT("react");

    private final String object;

    @Override
    public String getGroupName() {
        return "standard";
    }

    @Override
    public String getObjectName() {
        return object;
    }
}
