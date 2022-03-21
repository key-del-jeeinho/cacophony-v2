package com.cacophony.library.domain.event.trigger.parameter;

import com.cacophony.library.domain.event.common.Event;
import com.cacophony.library.global.common.Parameter;
import com.cacophony.library.global.trigger.parameter.TriggerParameter;

import java.time.LocalDateTime;

public interface EventTriggerParameter extends TriggerParameter<EventTriggerParameter.EventTriggerParameterBuilder> {
    EventTriggerParameterBuilder builder();
    @Override
    <T> EventTriggerParameter addParameter(String index, T object);

    interface EventTriggerParameterBuilder extends TriggerParameter.TriggerParameterBuilder {
        EventTriggerParameterBuilder event(Event event);
        EventTriggerParameterBuilder publishedAt(LocalDateTime publishedAt);

        EventTriggerParameter build();
    }
}
