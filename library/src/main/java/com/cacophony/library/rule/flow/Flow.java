package com.cacophony.library.rule.flow;

import com.cacophony.library.rule.action.Action;
import com.cacophony.library.rule.trigger.Trigger;

public interface Flow {
    Flow when(Trigger trigger);
    Flow doAction(Action action);
    Flow complete();

    void execute(FlowRequest e);
}
