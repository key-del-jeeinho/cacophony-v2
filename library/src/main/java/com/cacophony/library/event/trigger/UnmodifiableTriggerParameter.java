package com.cacophony.library.event.trigger;

import com.cacophony.library.exception.CacophonyAccessException;

import java.util.Collections;
import java.util.Map;

public class UnmodifiableTriggerParameter extends ImmutableEventTriggerParameter {
    public UnmodifiableTriggerParameter(Map<Integer, Object> params) {
        super(Collections.unmodifiableMap(params));
    }

    @Override
    public ParameterBuilder builder() {
        throw new CacophonyAccessException("해당 파라미터는 builder 를 통해 수정할 수 없습니다!");
    }
}
