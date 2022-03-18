package com.cacophony.library.rule.flow;

import com.cacophony.library.rule.action.Action;
import com.cacophony.library.rule.trigger.Trigger;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImmutableFlow implements Flow{
    private final Trigger trigger;
    private final Action action;

    public ImmutableFlow() {
        this(null, null);
    }

    @Override
    public Flow when(Trigger trigger) {
        return new ImmutableFlow(trigger, this.action);
    }

    @Override
    public Flow doAction(Action action) {
        return new ImmutableFlow(this.trigger, action);
    }

    @Override
    public Flow complete() {
        //TODO Flow 등록로직 작성
        return null;
    }

    @Override
    public void execute(FlowRequest e) {
        trigger.execute(e.toTriggerParameter());
        action.execute(e.toActionParameter());
    }
}
