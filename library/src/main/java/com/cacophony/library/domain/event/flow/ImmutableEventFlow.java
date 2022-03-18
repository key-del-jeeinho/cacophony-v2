package com.cacophony.library.domain.event.flow;

import com.cacophony.library.global.action.Action;
import com.cacophony.library.global.flow.FlowRequest;
import com.cacophony.library.global.trigger.Trigger;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImmutableEventFlow implements EventFlow {
    private final Trigger trigger;
    private final Action action;

    public ImmutableEventFlow() {
        this(null, null);
    }

    @Override
    public EventFlow when(Trigger trigger) {
        return new ImmutableEventFlow(trigger, this.action);
    }

    @Override
    public EventFlow doAction(Action action) {
        return new ImmutableEventFlow(this.trigger, action);
    }

    @Override
    public EventFlow complete() {
        //TODO Flow 등록로직 작성
        return null;
    }

    @Override
    public void execute(FlowRequest e) {
        trigger.execute(e.toTriggerParameter());
        action.execute(e.toActionParameter());
    }
}
