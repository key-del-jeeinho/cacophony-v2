package com.cacophony.library.domain.event.trigger.parameter;

import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class ImmutableEventTriggerParameter implements EventTriggerParameter {
    private final Map<Integer, Object> params;

    @Override
    public <T> T getParameter(Integer index, Class<T> clazz) {
        return clazz.cast(params.get(index));
    }

    @Override
    public EventTriggerParameterBuilder builder() {
        return new ImmutableEventTriggerParameterBuilder();
    }
}
