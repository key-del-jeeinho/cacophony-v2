package com.cacophony.library.domain.event.action;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class SimpleEventAction implements EventAction{
    private final Consumer<EventActionParameter> action;

    @Override
    public void execute(EventActionParameter parameter) {
        action.accept(parameter);
    }
}
