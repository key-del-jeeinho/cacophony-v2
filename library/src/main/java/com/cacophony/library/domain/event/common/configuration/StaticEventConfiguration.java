package com.cacophony.library.domain.event.common.configuration;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.flow.request.EventFlowRequest;
import com.cacophony.library.domain.event.publisher.EventPublisher;
import com.cacophony.library.domain.event.subscriber.EventSubscriber;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.global.common.exception.AlreadyInitializedConfigurationException;
import lombok.Getter;

public class StaticEventConfiguration {
    @Getter
    private static boolean isInitialized = false;
    private static EventConfiguration configuration;

    public static void init(EventConfiguration configuration) {
        if(isInitialized) throw new AlreadyInitializedConfigurationException(StaticEventConfiguration.class);
        StaticEventConfiguration.configuration = configuration;
        isInitialized = true;
    }

    public static EventAction action() {
        return configuration.action();
    }
    public static EventActionParameter actionParameter() {
        return configuration.actionParameter();
    }
    public static EventFlow flow() {
        return configuration.generateFlow();
    }
    public static EventFlowRequest flowRequest() {
        return configuration.flowRequest();
    }
    public static EventTrigger trigger() {
        return configuration.trigger();
    }
    public static EventTriggerParameter triggerParameter() {
        return configuration.triggerParameter();
    }
    public static EventPublisher publisher() {
        return configuration.publisher();
    }
    public static EventSubscriber subscriber() {
        return configuration.subscriber();
    }
}
