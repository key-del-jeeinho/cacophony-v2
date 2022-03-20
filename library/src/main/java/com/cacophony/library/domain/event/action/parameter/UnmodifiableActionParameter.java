package com.cacophony.library.domain.event.action.parameter;

import com.cacophony.library.global.action.exception.UnmodifiableActionParameterException;

import java.util.Collections;
import java.util.Map;

public class UnmodifiableActionParameter extends EventActionParameter {
    public UnmodifiableActionParameter(Map<Integer, Object> params) {
        super(Collections.unmodifiableMap(params));
    }

    @Override
    public <T> T getParameter(Integer index, Class<T> clazz) {
        return clazz.cast(getParams().get(index));
    }

    @Override
    public EventActionParameterBuilder builder() {
        throw new UnmodifiableActionParameterException("해당 파라미터는 builder 를 통해 수정할 수 없습니다!");
    }
}
