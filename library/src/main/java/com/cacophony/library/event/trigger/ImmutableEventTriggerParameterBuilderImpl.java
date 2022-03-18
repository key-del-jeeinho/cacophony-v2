package com.cacophony.library.event.trigger;

import com.cacophony.library.event.event.Event;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RequiredArgsConstructor
public class ImmutableEventTriggerParameterBuilderImpl implements ImmutableEventTriggerParameter.ParameterBuilder {
    private final Event event;
    private final LocalDateTime publishedAt;

    public ImmutableEventTriggerParameterBuilderImpl() {
        this(null, null);
    }

    @Override
    public ImmutableEventTriggerParameter.ParameterBuilder event(Event event) {
        return new ImmutableEventTriggerParameterBuilderImpl(event, this.publishedAt);
    }

    @Override
    public ImmutableEventTriggerParameter.ParameterBuilder publishedAt(LocalDateTime publishedAt) {
        return new ImmutableEventTriggerParameterBuilderImpl(this.event, publishedAt);
    }

    @Override
    public ImmutableEventTriggerParameter build() {
        Objects.requireNonNull(event);
        Objects.requireNonNull(publishedAt);
        final Map<Integer, Object> params = new HashMap<>();
        params.put(0, event);
        params.put(1, publishedAt);

        return new UnmodifiableTriggerParameter(params);
    }
}
