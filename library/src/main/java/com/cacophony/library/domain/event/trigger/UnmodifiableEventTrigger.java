package com.cacophony.library.domain.event.trigger;

import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.global.trigger.UnmodifiableTriggerException;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public class UnmodifiableEventTrigger implements EventTrigger {
    private final Function<EventTriggerParameter, Boolean> function;

    @Override
    public boolean check(EventTriggerParameter parameter) {
        return function.apply(parameter);
    }

    @Override
    public TriggerBuilder<?> builder() {
        throw new UnmodifiableTriggerException("해당 EventTrigger 는 builder 로 수정할 수 없습니다!");
    }
}
