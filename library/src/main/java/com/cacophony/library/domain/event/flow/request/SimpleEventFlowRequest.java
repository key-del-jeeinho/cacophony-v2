package com.cacophony.library.domain.event.flow.request;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.domain.event.common.Event;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class SimpleEventFlowRequest implements EventFlowRequest{
    private final Event event;
    private final LocalDateTime publishedAt;



    @Override
    public EventActionParameter toActionParameter() {
        EventActionParameter eventActionParameter = null; //TODO Generator 작성 후 수정
        return eventActionParameter.builder().event(event).build();
    }

    @Override
    public EventTriggerParameter toTriggerParameter() {
        EventTriggerParameter eventTriggerParameter = null; //TODO Generator 작성 후 수정
        return eventTriggerParameter.builder().event(event).publishedAt(publishedAt).build();
    }
}
