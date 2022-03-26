package com.cacophony.library.global.action.exception;

import com.cacophony.library.global.common.exception.UnmodifiableException;

public class UnmodifiableActionException extends UnmodifiableException {
    public UnmodifiableActionException(String message) {
        super(message);
    }
}
