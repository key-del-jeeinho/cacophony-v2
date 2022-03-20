package com.cacophony.library.domain.event.flow;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.global.flow.FlowRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImmutableEventFlow implements EventFlow {
    private final EventTrigger trigger;
    private final EventAction action;

    public ImmutableEventFlow() {
        this(null, null);
    }

    @Override
    public EventFlowBuilder builder() {
        return new ImmutableEventFlowBuilder();
    }

    @Override
    public void execute(EventFlowRequest e) {
        if(trigger.check(e.toTriggerParameter())) action.execute(e.toActionParameter());
    }
}
