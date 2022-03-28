package com.cacophony.library.domain.event.subscriber;

import com.cacophony.library.domain.event.flow.EventFlow;
import lombok.RequiredArgsConstructor;

public class ImmutableFlowEventSubscriber extends FlowEventSubscriber {
    public ImmutableFlowEventSubscriber(EventFlow flow) {
        super(flow);
    }
    public ImmutableFlowEventSubscriber() {
        this(null);
    }

    @Override
    public FlowEventSubscriberBuilder builder() {
        return new ImmutableFlowEventSubscriberBuilder();
    }
}
