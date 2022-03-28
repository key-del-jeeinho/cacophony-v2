package com.cacophony.library.domain.entry.event.builder;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.common.configuration.StaticEventConfiguration;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.global.Buildable;

public class BuildableEventFlowEntryActionBuilder extends EventFlowEntryActionBuilder implements Buildable<EventFlow> {
    public BuildableEventFlowEntryActionBuilder(EventAction action, EventTrigger trigger) {
        super(action, trigger);
    }


    @Override
    public EventFlow build() {
        return StaticEventConfiguration.flow()
                .builder()
                .when(trigger)
                .doAction(action)
                .build();
    }
}
