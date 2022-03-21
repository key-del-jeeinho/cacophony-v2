package com.cacophony.library.domain.event.action;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.global.action.UnmodifiableActionException;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class UnmodifiableEventAction implements EventAction {
    private final Consumer<EventActionParameter> function;

    @Override
    public void execute(EventActionParameter parameter) {
        function.accept(parameter);
    }

    @Override
    public EventActionBuilder builder() {
        throw new UnmodifiableActionException("해당 EventAction 은 builder 로 수정할 수 없습니다!");
    }
}
