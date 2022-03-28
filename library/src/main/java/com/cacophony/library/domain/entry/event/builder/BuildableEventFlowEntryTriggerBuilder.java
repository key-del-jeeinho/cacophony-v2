package com.cacophony.library.domain.entry.event.builder;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.common.manager.StaticEventManager;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.trigger.EventTrigger;

public class BuildableEventFlowEntryTriggerBuilder extends EventFlowEntryTriggerBuilder {
    public BuildableEventFlowEntryTriggerBuilder(EventAction action, EventTrigger trigger) {
        super(action, trigger);
    }

    @Override
    public EventFlow build() {
        return StaticEventManager.flow()
                .builder()
                .when(trigger)
                .doAction(action)
                .build();
    }
}
