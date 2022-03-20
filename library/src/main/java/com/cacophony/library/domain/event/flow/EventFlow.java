package com.cacophony.library.domain.event.flow;

import com.cacophony.library.global.action.Action;
import com.cacophony.library.global.flow.Flow;
import com.cacophony.library.global.trigger.Trigger;

public interface EventFlow extends Flow {
    @Override
    EventFlowBuilder builder();

    interface EventFlowBuilder extends Flow.FlowBuilder {
        @Override
        EventFlowBuilder when(Trigger trigger);

        @Override
        EventFlowBuilder doAction(Action action);

        @Override
        EventFlow complete();
    }
}
