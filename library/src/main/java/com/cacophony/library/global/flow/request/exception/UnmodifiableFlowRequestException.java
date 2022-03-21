package com.cacophony.library.global.flow.request.exception;

import com.cacophony.library.global.common.exception.UnmodifiableException;

public class UnmodifiableFlowRequestException extends UnmodifiableException {
    public UnmodifiableFlowRequestException(String message) {
        super(message);
    }
}
