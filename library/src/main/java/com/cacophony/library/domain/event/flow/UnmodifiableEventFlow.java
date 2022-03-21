package com.cacophony.library.domain.event.flow;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.flow.request.EventFlowRequest;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.global.flow.exception.UnmodifiableFlowException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UnmodifiableEventFlow implements EventFlow {
    private final EventTrigger trigger;
    private final EventAction action;

    @Override
    public EventFlowBuilder builder() {
        throw new UnmodifiableFlowException("해당 Flow 는 builder 로 수정할 수 없습니다!");
    }

    @Override
    public void execute(EventFlowRequest e) {
        if(trigger.check(e.toTriggerParameter())) action.execute(e.toActionParameter());
    }
}
