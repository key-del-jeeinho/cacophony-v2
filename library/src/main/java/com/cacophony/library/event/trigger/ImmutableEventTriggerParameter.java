package com.cacophony.library.event.trigger;

import com.cacophony.library.event.event.Event;
import com.cacophony.library.global.trigger.TriggerParameter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@RequiredArgsConstructor
public abstract class ImmutableEventTriggerParameter implements TriggerParameter {
    private final Map<Integer, Object> params;

    @Override
    public <T> T getParameter(Integer index, Class<T> clazz) {
        return clazz.cast(params.get(index));
    }

    public abstract ParameterBuilder builder();

    public interface ParameterBuilder {
        ParameterBuilder event(Event event);
        ParameterBuilder publishedAt(LocalDateTime publishedAt);

        ImmutableEventTriggerParameter build();
    }
}
