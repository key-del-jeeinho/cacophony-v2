package com.cacophony.library.domain.event.action;

import java.util.Map;

public class ImmutableEventActionParameter extends EventActionParameter{
    public ImmutableEventActionParameter(Map<Integer, Object> params) {
        super(params);
    }

    @Override
    public <T> T getParameter(Integer index, Class<T> clazz) {
        return clazz.cast(getParams().get(index));
    }

    @Override
    public EventActionParameterBuilder builder() {
        return new ImmutableEventActionParameterBuilder();
    }
}
