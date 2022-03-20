package com.cacophony.library.domain.event.trigger.parameter;

import com.cacophony.library.global.trigger.exception.UnmodifiableTriggerParameterException;

import java.util.Collections;
import java.util.Map;

public class UnmodifiableTriggerParameter implements EventTriggerParameter {
    private final Map<Integer, Object> params;

    public UnmodifiableTriggerParameter(Map<Integer, Object> params) {
        this.params = Collections.unmodifiableMap(params);
    }

    @Override
    public EventTriggerParameterBuilder builder() {
        throw new UnmodifiableTriggerParameterException("해당 파라미터는 builder 를 통해 수정할 수 없습니다!");
    }

    @Override
    public <T> T getParameter(Integer index, Class<T> clazz) {
        return clazz.cast(params.get(index));
    }
}
