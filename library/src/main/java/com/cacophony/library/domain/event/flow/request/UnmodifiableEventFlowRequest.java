package com.cacophony.library.domain.event.flow.request;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.common.configuration.StaticEventConfiguration;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.global.flow.request.exception.UnmodifiableFlowRequestException;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class UnmodifiableEventFlowRequest implements EventFlowRequest {
    private final Event event;
    private final LocalDateTime publishedAt;

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
        throw new UnmodifiableFlowRequestException("해당 FlowRequest 는 builder 로 수정할 수 없습니다!");
    }
}
