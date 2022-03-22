package com.cacophony.library.domain.event.flow;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.flow.request.EventFlowRequest;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.global.flow.Flow;

public interface EventFlow extends Flow<EventFlow.EventFlowBuilder, EventFlowRequest> {
    @Override
    EventFlowBuilder builder();

    interface EventFlowBuilder extends Flow.FlowBuilder<EventTrigger, EventAction> {
        @Override
        EventFlowBuilder when(EventTrigger trigger);

        @Override
        EventFlowBuilder doAction(EventAction action);

        @Override
        EventFlow build();
    }
}
