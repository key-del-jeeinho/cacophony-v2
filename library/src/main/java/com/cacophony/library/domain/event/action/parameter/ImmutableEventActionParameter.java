package com.cacophony.library.domain.event.action.parameter;

import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class ImmutableEventActionParameter implements EventActionParameter{
    private final Map<Integer, Object> params;

    @Override
    public <T> T getParameter(Integer index, Class<T> clazz) {
        return clazz.cast(params.get(index));
    }

    @Override
    public EventActionParameterBuilder builder() {
        return new ImmutableEventActionParameterBuilder();
    }
}
