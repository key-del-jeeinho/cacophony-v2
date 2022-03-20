package com.cacophony.library.global.trigger;

public interface Trigger<T extends TriggerParameter<?>> {
    boolean check(T parameter);
}
