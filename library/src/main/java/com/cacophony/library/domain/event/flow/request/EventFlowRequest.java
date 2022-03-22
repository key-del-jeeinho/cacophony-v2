package com.cacophony.library.domain.event.flow.request;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.global.flow.request.FlowRequest;

import java.time.LocalDateTime;

public interface EventFlowRequest extends FlowRequest<EventActionParameter, EventTriggerParameter> {
    @Override
    EventFlowRequestBuilder builder();

    interface EventFlowRequestBuilder extends FlowRequest.FlowRequestBuilder<EventFlowRequest> {
        EventFlowRequestBuilder event(Event event);
        EventFlowRequestBuilder publishedAt(LocalDateTime publishedAt);
    }
}