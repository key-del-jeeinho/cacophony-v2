package com.cacophony.library.domain.event.common.manager;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.action.EventActionGenerator;
import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.action.parameter.EventActionParameterGenerator;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.flow.EventFlowGenerator;
import com.cacophony.library.domain.event.flow.request.EventFlowRequest;
import com.cacophony.library.domain.event.flow.request.EventFlowRequestGenerator;
import com.cacophony.library.domain.event.publisher.EventPublisher;
import com.cacophony.library.domain.event.publisher.EventPublisherGenerator;
import com.cacophony.library.domain.event.subscriber.EventSubscriber;
import com.cacophony.library.domain.event.subscriber.EventSubscriberGenerator;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.domain.event.trigger.EventTriggerGenerator;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameterGenerator;

public abstract class BasicEventManager implements EventManager {
    private final EventActionGenerator actionGenerator;
    private final EventActionParameterGenerator actionParameterGenerator;

    private final EventFlowGenerator flowGenerator;
    private final EventFlowRequestGenerator flowRequestGenerator;

    private final EventTriggerGenerator triggerGenerator;
    private final EventTriggerParameterGenerator triggerParameterGenerator;

    private final EventPublisherGenerator eventPublisherGenerator;
    private final EventSubscriberGenerator eventSubscriberGenerator;

    public BasicEventManager(EventActionGenerator actionGenerator,
                             EventActionParameterGenerator actionParameterGenerator,
                             EventFlowGenerator flowGenerator,
                             EventFlowRequestGenerator flowRequestGenerator,
                             EventTriggerGenerator triggerGenerator,
                             EventTriggerParameterGenerator triggerParameterGenerator,
                             EventPublisherGenerator eventPublisherGenerator,
                             EventSubscriberGenerator eventSubscriberGenerator,
                             boolean isGlobalConfiguration) {
        this.actionGenerator = actionGenerator;
        this.actionParameterGenerator = actionParameterGenerator;
        this.flowGenerator = flowGenerator;
        this.flowRequestGenerator = flowRequestGenerator;
        this.triggerGenerator = triggerGenerator;
        this.triggerParameterGenerator = triggerParameterGenerator;
        this.eventPublisherGenerator = eventPublisherGenerator;
        this.eventSubscriberGenerator = eventSubscriberGenerator;

        if(isGlobalConfiguration) initStatic();
    }

    private void initStatic() {
        StaticEventManager.init(this);
    }

    @Override
    public EventAction action() {
        return actionGenerator.generateDefault();
    }
    @Override
    public EventActionParameter actionParameter() {
        return actionParameterGenerator.generateDefault();
    }
    @Override
    public EventFlow generateFlow() {
        return flowGenerator.generateDefault();
    }
    @Override
    public EventFlowRequest flowRequest() {
        return flowRequestGenerator.generateDefault();
    }
    @Override
    public EventTrigger trigger() {
        return triggerGenerator.generateDefault();
    }
    @Override
    public EventTriggerParameter triggerParameter() {
        return triggerParameterGenerator.generateDefault();
    }

    @Override
    public EventPublisher publisher() {
        return eventPublisherGenerator.generateDefault();
    }

    @Override
    public EventSubscriber subscriber() {
        return eventSubscriberGenerator.generateDefault();
    }
}
