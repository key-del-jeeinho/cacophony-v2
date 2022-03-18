package com.cacophony.library.global.flow;

import com.cacophony.library.global.action.Action;
import com.cacophony.library.global.trigger.Trigger;

public interface Flow {
    Flow when(Trigger trigger);
    Flow doAction(Action action);
    Flow complete();

    void execute(FlowRequest e);
}
