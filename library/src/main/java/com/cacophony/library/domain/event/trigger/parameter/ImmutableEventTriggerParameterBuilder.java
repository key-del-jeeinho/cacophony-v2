package com.cacophony.library.domain.event.trigger.parameter;

import com.cacophony.library.domain.event.common.Event;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RequiredArgsConstructor
public class ImmutableEventTriggerParameterBuilder implements EventTriggerParameter.EventTriggerParameterBuilder {
    private final Event event;
    private final LocalDateTime publishedAt;

    public ImmutableEventTriggerParameterBuilder() {
        this(null, null);
    }

    @Override
    public EventTriggerParameter.EventTriggerParameterBuilder event(Event event) {
        return new ImmutableEventTriggerParameterBuilder(event, this.publishedAt);
    }

    @Override
    public EventTriggerParameter.EventTriggerParameterBuilder publishedAt(LocalDateTime publishedAt) {
        return new ImmutableEventTriggerParameterBuilder(this.event, publishedAt);
    }

    @Override
    public EventTriggerParameter build() {
        Objects.requireNonNull(event);
        Objects.requireNonNull(publishedAt);

        final Map<String, Object> params = new HashMap<>();
        params.put("event", event);
        params.put("publishedAt", publishedAt);
        return new ImmutableEventTriggerParameter(params);
    }
}
