package com.cacophony.library.domain.event.trigger;

import com.cacophony.library.global.trigger.TriggerGenerator;

public class EventTriggerGenerator extends TriggerGenerator<EventTrigger> {
    public EventTriggerGenerator(EventTriggerGenerateStrategy generateStrategy) {
        super(generateStrategy);
    }
}
