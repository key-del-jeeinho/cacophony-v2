package com.cacophony.library.domain.event.trigger;

import java.util.Map;

public class ImmutableEventTriggerParameter extends EventTriggerParameter {
    public ImmutableEventTriggerParameter(Map<Integer, Object> params) {
        super(params);
    }

    @Override
    public <T> T getParameter(Integer index, Class<T> clazz) {
        return clazz.cast(getParams().get(index));
    }

    @Override
    public EventTriggerParameterBuilder builder() {
        return new ImmutableEventTriggerParameterBuilder();
    }
}
