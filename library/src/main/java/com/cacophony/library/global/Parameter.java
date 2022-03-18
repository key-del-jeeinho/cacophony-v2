package com.cacophony.library.global;

public interface Parameter {
    <T> T getParameter(Integer index, Class<T> clazz);
    default Object getParameter(Integer index) {
        return getParameter(index, Object.class);
    }

    ParameterBuilder builder();

    interface ParameterBuilder {
        Parameter build();
    }
}
