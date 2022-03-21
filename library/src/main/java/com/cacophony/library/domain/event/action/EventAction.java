package com.cacophony.library.domain.event.action;

import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.global.action.Action;

import java.util.function.Consumer;

public interface EventAction extends Action<EventActionParameter> {
    @Override
    EventActionBuilder builder();

    interface EventActionBuilder extends ActionBuilder<EventAction> {
        EventActionBuilder function(Consumer<EventActionParameter> function);
    }
}
