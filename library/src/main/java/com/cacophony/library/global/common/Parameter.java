package com.cacophony.library.global.common;

import com.cacophony.library.global.Buildable;

public interface Parameter<B extends Parameter.ParameterBuilder> {
    <T> T getParameter(String index, Class<T> clazz);
    <T> Parameter<B> addParameter(String index, T object);
    default Object getParameter(String index) {
        return getParameter(index, Object.class);
    }

    B builder();

    interface ParameterBuilder extends Buildable<Parameter<?>> {
        @Override
        Parameter<?> build();
    }
}
