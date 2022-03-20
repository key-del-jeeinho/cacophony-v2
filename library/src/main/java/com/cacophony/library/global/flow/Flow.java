package com.cacophony.library.global.flow;

import com.cacophony.library.global.action.Action;
import com.cacophony.library.global.trigger.Trigger;

public interface Flow {
    FlowBuilder builder();

    void execute(FlowRequest e);

    interface FlowBuilder {
        FlowBuilder when(Trigger trigger);
        FlowBuilder doAction(Action action);
        Flow complete();
    }
}
