package com.cacophony.library.domain.event.subscriber;

import com.cacophony.library.domain.event.flow.EventFlow;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImmutableFlowEventSubscriberBuilder implements FlowEventSubscriber.FlowEventSubscriberBuilder {
    private final EventFlow flow;

    public ImmutableFlowEventSubscriberBuilder() {
        this(null);
    }

    @Override
    public FlowEventSubscriber.FlowEventSubscriberBuilder flow(EventFlow flow) {
        return new ImmutableFlowEventSubscriberBuilder(flow);
    }

    @Override
    public FlowEventSubscriber build() {
        return new ImmutableFlowEventSubscriber(flow);
    }
}
