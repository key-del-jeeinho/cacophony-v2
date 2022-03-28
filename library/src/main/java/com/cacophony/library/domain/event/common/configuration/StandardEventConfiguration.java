package com.cacophony.library.domain.event.common.configuration;

import com.cacophony.library.domain.event.action.EventActionGenerator;
import com.cacophony.library.domain.event.action.ImmutableEventAction;
import com.cacophony.library.domain.event.action.parameter.EventActionParameterGenerator;
import com.cacophony.library.domain.event.action.parameter.ImmutableEventActionParameter;
import com.cacophony.library.domain.event.flow.EventFlowGenerator;
import com.cacophony.library.domain.event.flow.ImmutableEventFlow;
import com.cacophony.library.domain.event.flow.request.EventFlowRequestGenerator;
import com.cacophony.library.domain.event.flow.request.ImmutableEventFlowRequest;
import com.cacophony.library.domain.event.publisher.SimpleEventPublisher;
import com.cacophony.library.domain.event.publisher.SingletonEventPublisherGenerator;
import com.cacophony.library.domain.event.subscriber.EventSubscriberGenerator;
import com.cacophony.library.domain.event.subscriber.FlowEventSubscriber;
import com.cacophony.library.domain.event.subscriber.ImmutableFlowEventSubscriber;
import com.cacophony.library.domain.event.trigger.EventTriggerGenerator;
import com.cacophony.library.domain.event.trigger.ImmutableEventTrigger;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameterGenerator;
import com.cacophony.library.domain.event.trigger.parameter.ImmutableEventTriggerParameter;

public class StandardEventConfiguration extends BasicEventConfiguration {
    public StandardEventConfiguration(boolean isGlobalConfiguration) {
        super(new EventActionGenerator(ImmutableEventAction::new),
                new EventActionParameterGenerator(ImmutableEventActionParameter::new),
                new EventFlowGenerator(ImmutableEventFlow::new),
                new EventFlowRequestGenerator(ImmutableEventFlowRequest::new),
                new EventTriggerGenerator(ImmutableEventTrigger::new),
                new EventTriggerParameterGenerator(ImmutableEventTriggerParameter::new),
                new SingletonEventPublisherGenerator(SimpleEventPublisher::new),
                new EventSubscriberGenerator(ImmutableFlowEventSubscriber::new),
                isGlobalConfiguration);
    }
}
