package com.cacophony.library.event.flow;

import com.cacophony.library.global.action.Action;
import com.cacophony.library.global.flow.Flow;
import com.cacophony.library.global.trigger.Trigger;

public interface EventFlow extends Flow {
    @Override
    EventFlow when(Trigger trigger);

    @Override
    EventFlow doAction(Action action);

    @Override
    EventFlow complete();
}
