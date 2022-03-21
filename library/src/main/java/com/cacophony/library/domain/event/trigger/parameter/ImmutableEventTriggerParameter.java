package com.cacophony.library.domain.event.trigger.parameter;

import com.cacophony.library.global.common.Parameter;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class ImmutableEventTriggerParameter implements EventTriggerParameter {
    private final Map<String, Object> params;

    public ImmutableEventTriggerParameter() {
        this(null);
    }

    @Override
    public <T> T getParameter(String index, Class<T> clazz) {
        return clazz.cast(params.get(index));
    }

    @Override
    public <T> EventTriggerParameter addParameter(String index, T object) {
        params.put(index, object);
        return this;
    }

    @Override
    public EventTriggerParameterBuilder builder() {
        return new ImmutableEventTriggerParameterBuilder();
    }
}
