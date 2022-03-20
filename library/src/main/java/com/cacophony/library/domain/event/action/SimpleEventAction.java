package com.cacophony.library.domain.event.action;

import com.cacophony.library.global.action.ActionParameter;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class SimpleEventAction implements EventAction{
    private final Consumer<ActionParameter> action;

    @Override
    public void execute(ActionParameter parameter) {
        action.accept(parameter);
    }
}
