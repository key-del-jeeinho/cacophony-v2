package com.cacophony.library.domain.event.trigger;

import com.cacophony.library.global.events.Event;
import com.cacophony.library.global.trigger.TriggerParameter;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@AllArgsConstructor
public abstract class EventTriggerParameter implements TriggerParameter {
    private Map<Integer, Object> params;

    public abstract EventTriggerParameterBuilder builder();

    //non-public Getters and Setters
    protected Map<Integer, Object> getParams() {
        return params;
    }
    protected void setParams(Map<Integer, Object> params) {
        this.params = params;
    }

    public interface EventTriggerParameterBuilder extends TriggerParameterBuilder {
        EventTriggerParameterBuilder event(Event event);
        EventTriggerParameterBuilder publishedAt(LocalDateTime publishedAt);

        EventTriggerParameter build();
    }
}
