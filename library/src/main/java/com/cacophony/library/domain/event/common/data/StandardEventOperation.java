package com.cacophony.library.domain.event.common.data;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StandardEventOperation implements EventOperation {
    CREATE("create"), READ("read"), UPDATE("update"), DELETE("delete"), ETC("etc");

    private final String operation;

    @Override
    public String getOperation() {
        return operation;
    }
}
