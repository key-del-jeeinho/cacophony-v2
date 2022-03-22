package com.cacophony.library.domain.event.flow.request;

import com.cacophony.library.domain.event.common.data.Event;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class ImmutableEventFlowRequestBuilder implements EventFlowRequest.EventFlowRequestBuilder {
    private final Event event;
    private final LocalDateTime publishedAt;

    public ImmutableEventFlowRequestBuilder() {
        this(null, null);
    }

    @Override
    public EventFlowRequest.EventFlowRequestBuilder event(Event event) {
        return new ImmutableEventFlowRequestBuilder(event, this.publishedAt);
    }

    @Override
    public EventFlowRequest.EventFlowRequestBuilder publishedAt(LocalDateTime publishedAt) {
        return new ImmutableEventFlowRequestBuilder(this.event, publishedAt);
    }

    @Override
    public EventFlowRequest build() {
        return new UnmodifiableEventFlowRequest(event, publishedAt);
    }
}
