package com.cacophony.library.domain.event.action.parameter;

import com.cacophony.library.global.events.Event;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RequiredArgsConstructor
public class ImmutableEventActionParameterBuilder implements EventActionParameter.EventActionParameterBuilder {
    private final Event event;

    public ImmutableEventActionParameterBuilder() {
        this(null);
    }

    @Override
    public EventActionParameter.EventActionParameterBuilder event(Event event) {
        return new ImmutableEventActionParameterBuilder(event);
    }

    @Override
    public EventActionParameter build() {
        Objects.requireNonNull(event);

        final Map<Integer, Object> params = new HashMap<>();
        params.put(0, event);
        return new UnmodifiableActionParameter(params);
    }
}
