package com.cacophony.library.domain.event.flow;

import com.cacophony.library.global.action.Action;
import com.cacophony.library.global.flow.FlowRequest;
import com.cacophony.library.global.flow.exception.UnmodifiableFlowException;
import com.cacophony.library.global.trigger.Trigger;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UnmodifiableEventFlow implements EventFlow {
    private final Trigger trigger;
    private final Action action;

    @Override
    public EventFlow when(Trigger trigger) {
        throw new UnmodifiableFlowException("해당 플로우의 trigger 는 수정할 수 없습니다!");
    }

    @Override
    public EventFlow doAction(Action action) {
        throw new UnmodifiableFlowException("해당 플로우의 action 은 수정할 수 없습니다!");
    }

    @Override
    public EventFlow complete() {
        throw new UnmodifiableFlowException("해당 플로우는 이미 complete되었습니다!");
    }

    @Override
    public void execute(FlowRequest e) {
        if(trigger.check(e.toTriggerParameter())) action.execute(e.toActionParameter());
    }
}
