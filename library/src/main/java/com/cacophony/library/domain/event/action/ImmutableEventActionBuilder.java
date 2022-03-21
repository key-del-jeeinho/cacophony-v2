package com.cacophony.library.domain.event.action;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class ImmutableEventActionBuilder implements EventAction.EventActionBuilder {
    private final Consumer<EventActionParameter> function;

    public ImmutableEventActionBuilder() {
        this(null);
    }

    @Override
    public EventAction.EventActionBuilder function(Consumer<EventActionParameter> function) {
        return new ImmutableEventActionBuilder(function);
    }

    @Override
    public EventAction build() {
        return new UnmodifiableEventAction(function);
    }
}
