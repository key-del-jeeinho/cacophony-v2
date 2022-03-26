package com.cacophony.library.global.common.exception;

import lombok.Getter;

@Getter
public class AlreadyInitializedConfigurationException extends RuntimeException {
    private final Class<?> configuration;

    //configuration 은 초기화를 시도한 configuration 을 뜻한다.
    public AlreadyInitializedConfigurationException(Class<?> configuration) {
        super(configuration.getCanonicalName() + "은 이미 초기화된 configuration 입니다!");
        this.configuration = configuration;
    }
}
