package com.cacophony.library.event.trigger;

import java.util.Map;

public abstract class ImmutableEventTriggerParameter extends EventTriggerParameter {
    public ImmutableEventTriggerParameter(Map<Integer, Object> params) {
        super(params);
    }

    @Override
    public <T> T getParameter(Integer index, Class<T> clazz) {
        return clazz.cast(getParams().get(index));
    }
}
