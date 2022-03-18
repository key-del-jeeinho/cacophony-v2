package com.cacophony.library.domain.event.trigger;

import com.cacophony.library.global.events.Event;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RequiredArgsConstructor
public class ImmutableEventTriggerParameterBuilderImpl implements EventTriggerParameter.EventTriggerParameterBuilder {
    private final Event event;
    private final LocalDateTime publishedAt;

    public ImmutableEventTriggerParameterBuilderImpl() {
        this(null, null);
    }

    @Override
    public EventTriggerParameter.EventTriggerParameterBuilder event(Event event) {
        return new ImmutableEventTriggerParameterBuilderImpl(event, this.publishedAt);
    }

    @Override
    public EventTriggerParameter.EventTriggerParameterBuilder publishedAt(LocalDateTime publishedAt) {
        return new ImmutableEventTriggerParameterBuilderImpl(this.event, publishedAt);
    }

    @Override
    public EventTriggerParameter build() {
        Objects.requireNonNull(event);
        Objects.requireNonNull(publishedAt);

        final Map<Integer, Object> params = new HashMap<>();
        params.put(0, event);
        params.put(1, publishedAt);
        //TODO build 된 Parameter 는 더이상 수정될 수 없다. 는 ImmutableEventTriggerParameterBuilder 의 책임(역할)과는 동떨어져있는 역할이 아닐까?
        return new UnmodifiableTriggerParameter(params);
    }
}
