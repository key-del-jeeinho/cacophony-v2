package com.cacophony.library.domain.events.react;

import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ReactEventType implements EventType {
    CREATE("create"), DELETE("delete");

    private final String object;

    @Override
    public String getGroupName() {
        return StandardEventType.REACT_EVENT.getObjectName();
    }

    @Override
    public String getObjectName() {
        return object;
    }
}
