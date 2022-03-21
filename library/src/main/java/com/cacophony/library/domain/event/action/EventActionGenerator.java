package com.cacophony.library.domain.event.action;

import com.cacophony.library.global.action.ActionGenerator;

public class EventActionGenerator extends ActionGenerator<EventAction> {
    public EventActionGenerator(EventActionGenerateStrategy generateStrategy) {
        super(generateStrategy);
    }
}
