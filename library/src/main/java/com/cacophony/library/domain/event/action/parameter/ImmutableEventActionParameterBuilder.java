package com.cacophony.library.domain.event.action.parameter;

import com.cacophony.library.domain.event.common.data.Event;
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

        final Map<String, Object> params = new HashMap<>();
        params.put("event", event);
        return new ImmutableEventActionParameter(params); //TODO 다른방법 고민해보기
    }
}
