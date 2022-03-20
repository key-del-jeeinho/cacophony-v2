package com.cacophony.library.domain.event.action.parameter;

import com.cacophony.library.global.action.ActionParameter;
import com.cacophony.library.global.events.Event;
import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public abstract class EventActionParameter implements ActionParameter {
    private Map<Integer, Object> params;

    public abstract EventActionParameterBuilder builder();

    //non-public Getters and Setters
    protected Map<Integer, Object> getParams() {
        return params;
    }
    protected void setParams(Map<Integer, Object> params) {
        this.params = params;
    }

    public interface EventActionParameterBuilder extends ActionParameter.ActionParameterBuilder {
        EventActionParameter.EventActionParameterBuilder event(Event event);

        EventActionParameter build();
    }
}
