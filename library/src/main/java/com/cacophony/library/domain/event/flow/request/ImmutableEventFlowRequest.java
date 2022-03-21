package com.cacophony.library.domain.event.flow.request;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.common.StaticEventConfiguration;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.domain.event.common.Event;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class ImmutableEventFlowRequest implements EventFlowRequest{
    private final Event event;
    private final LocalDateTime publishedAt;

    public ImmutableEventFlowRequest() {
        this(null, null);
    }

    @Override
    public EventActionParameter toActionParameter() {
        return StaticEventConfiguration
                .generateActionParameter()
                .builder()
                .event(event)
                .build();
    }

    @Override
    public EventTriggerParameter toTriggerParameter() {
        return StaticEventConfiguration
                .generateTriggerParameter()
                .builder()
                .event(event)
                .publishedAt(publishedAt)
                .build();
    }

    @Override
    public EventFlowRequestBuilder builder() {
        return new ImmutableEventFlowRequestBuilder();
    }
}
