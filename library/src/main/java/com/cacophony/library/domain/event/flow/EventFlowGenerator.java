package com.cacophony.library.domain.event.flow;

import com.cacophony.library.global.flow.FlowGenerator;

public class EventFlowGenerator extends FlowGenerator<EventFlow> {
    public EventFlowGenerator(EventFlowGenerateStrategy generateStrategy) {
        super(generateStrategy);
    }
}
