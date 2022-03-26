package com.cacophony.library.global.action;

import com.cacophony.library.global.Buildable;
import com.cacophony.library.global.action.parameter.ActionParameter;

public interface Action<T extends ActionParameter<?>> {
    void execute(T parameter);

    ActionBuilder<?> builder();

    interface ActionBuilder<T extends Action<?>> extends Buildable<T> {
        @Override
        T build();
    }
}
