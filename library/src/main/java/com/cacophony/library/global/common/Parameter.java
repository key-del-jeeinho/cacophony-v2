package com.cacophony.library.global.common;

public interface Parameter<B extends Parameter.ParameterBuilder> {
    <T> T getParameter(String index, Class<T> clazz);
    default Object getParameter(String index) {
        return getParameter(index, Object.class);
    }

    B builder();

    interface ParameterBuilder {
        Parameter<?> build();
    }
}
