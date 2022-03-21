package com.cacophony.library.domain.event.action;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class ImmutableEventAction implements EventAction{
    private final Consumer<EventActionParameter> function;

    public ImmutableEventAction() {
        this(null);
    }

    @Override
    public void execute(EventActionParameter parameter) {
        function.accept(parameter);
    }

    @Override
    public EventActionBuilder builder() {
        return new ImmutableEventActionBuilder();
    }
}
