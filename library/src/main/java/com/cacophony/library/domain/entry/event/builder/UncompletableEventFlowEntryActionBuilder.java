package com.cacophony.library.domain.entry.event.builder;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.entry.event.exception.UncompletableEventFlowEntryException;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.trigger.EventTrigger;

public class UncompletableEventFlowEntryActionBuilder extends EventFlowEntryActionBuilder {
    public UncompletableEventFlowEntryActionBuilder(EventAction action, EventTrigger trigger) {
        super(action, trigger);
    }

    @Override
    public EventFlow complete() {
        throw new UncompletableEventFlowEntryException();
    }
}
