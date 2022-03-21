package com.cacophony.library.domain.event.flow.builder;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.flow.UnmodifiableEventFlow;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImmutableEventFlowBuilder implements EventFlow.EventFlowBuilder {
    private final EventTrigger trigger;
    private final EventAction action;

    public ImmutableEventFlowBuilder() {
        this(null, null);
    }

    @Override
    public EventFlow.EventFlowBuilder when(EventTrigger trigger) {
        return new ImmutableEventFlowBuilder(trigger, this.action);
    }

    @Override
    public EventFlow.EventFlowBuilder doAction(EventAction action) {
        return new ImmutableEventFlowBuilder(this.trigger, action);
    }

    @Override
    public EventFlow complete() {
        return new UnmodifiableEventFlow(this.trigger, this.action);
    }
}
