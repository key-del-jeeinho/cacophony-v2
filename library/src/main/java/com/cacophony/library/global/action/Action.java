package com.cacophony.library.global.action;

import com.cacophony.library.global.action.parameter.ActionParameter;

public interface Action<T extends ActionParameter<?>> {
    void execute(T parameter);
}
