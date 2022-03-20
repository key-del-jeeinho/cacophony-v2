package com.cacophony.library.domain.event.flow;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.global.action.Action;
import com.cacophony.library.global.trigger.Trigger;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImmutableEventFlowBuilder implements EventFlow.EventFlowBuilder {
    private final EventTrigger trigger;
    private final EventAction action;

    public ImmutableEventFlowBuilder() {
        this(null, null);
    }

    @Override
    public EventFlow.EventFlowBuilder when(Trigger trigger) {
        return new ImmutableEventFlowBuilder((EventTrigger) trigger, this.action);
    }

    @Override
    public EventFlow.EventFlowBuilder doAction(Action action) {
        return new ImmutableEventFlowBuilder(this.trigger, (EventAction) action);
    }

    @Override
    public EventFlow complete() {
        return new UnmodifiableEventFlow(this.trigger, this.action);
    }
}
