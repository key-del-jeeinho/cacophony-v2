package com.cacophony.library.domain.event.action.parameter;

import com.cacophony.library.global.action.exception.UnmodifiableActionParameterException;
import com.cacophony.library.global.common.Parameter;

import java.util.Collections;
import java.util.Map;

public class UnmodifiableActionParameter implements EventActionParameter {
    private final Map<String, Object> params;

    public UnmodifiableActionParameter(Map<String, Object> params) {
        this.params = Collections.unmodifiableMap(params);
    }

    @Override
    public <T> T getParameter(String index, Class<T> clazz) {
        return clazz.cast(params.get(index));
    }

    @Override
    public <T> EventActionParameter addParameter(String index, T object) {
        throw new UnmodifiableActionParameterException("해당 파라미터는 특정 파라미터를 추가할 수 없습니다!");
    }

    @Override
    public EventActionParameterBuilder builder() {
        throw new UnmodifiableActionParameterException("해당 파라미터는 builder 를 통해 수정할 수 없습니다!");
    }
}
