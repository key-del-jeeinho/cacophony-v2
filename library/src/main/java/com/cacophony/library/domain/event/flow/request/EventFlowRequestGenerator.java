package com.cacophony.library.domain.event.flow.request;

import com.cacophony.library.global.flow.request.FlowRequestGenerator;

public class EventFlowRequestGenerator extends FlowRequestGenerator<EventFlowRequest> {
    public EventFlowRequestGenerator(EventFlowRequestGenerateStrategy generateStrategy) {
        super(generateStrategy);
    }
}
