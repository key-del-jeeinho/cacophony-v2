package com.cacophony.library.domain.entry.event.exception;

import com.cacophony.library.global.common.exception.UnmodifiableException;

public class UncompletableEventFlowEntryException extends UnmodifiableException {
    public UncompletableEventFlowEntryException() {
        super("끝낼 수 없는 EventFlowEntry 입니다!");
    }
}
