package com.cacophony.library.global.trigger;

import com.cacophony.library.global.trigger.parameter.TriggerParameter;

public interface Trigger<T extends TriggerParameter<?>> {
    boolean check(T parameter);

    TriggerBuilder<?> builder();

    interface TriggerBuilder<T extends Trigger<?>> {
        T build();
    }
}
