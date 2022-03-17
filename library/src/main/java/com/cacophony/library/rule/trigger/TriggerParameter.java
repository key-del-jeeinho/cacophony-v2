package com.cacophony.library.rule.trigger;

public interface TriggerParameter {
    default Object getParameter(Integer index) {
        return getParameter(index, Object.class);
    }

    <T> T getParameter(Integer index, Class<T> clazz);
}
