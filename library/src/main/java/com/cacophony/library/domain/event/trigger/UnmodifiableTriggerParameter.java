package com.cacophony.library.domain.event.trigger;

import com.cacophony.library.global.common.exception.CacophonyAccessException;

import java.util.Collections;
import java.util.Map;

public class UnmodifiableTriggerParameter extends EventTriggerParameter {
    public UnmodifiableTriggerParameter(Map<Integer, Object> params) {
        super(Collections.unmodifiableMap(params));
    }

    @Override
    public EventTriggerParameterBuilder builder() {
        throw new CacophonyAccessException("해당 파라미터는 builder 를 통해 수정할 수 없습니다!");
    }

    @Override
    public <T> T getParameter(Integer index, Class<T> clazz) {
        return null;
    }
}
