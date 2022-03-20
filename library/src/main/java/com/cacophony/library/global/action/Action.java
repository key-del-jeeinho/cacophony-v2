package com.cacophony.library.global.action;

public interface Action<T extends ActionParameter<?>> {
    void execute(T parameter);
}
