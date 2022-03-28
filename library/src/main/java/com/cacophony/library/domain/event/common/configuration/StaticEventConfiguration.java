package com.cacophony.library.domain.event.common.configuration;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.flow.request.EventFlowRequest;
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

    public static EventAction generateAction() {
        return configuration.action();
    }
    public static EventActionParameter generateActionParameter() {
        return configuration.actionParameter();
    }
    public static EventFlow generateFlow() {
        return configuration.generateFlow();
    }
    public static EventFlowRequest generateFlowRequest() {
        return configuration.flowRequest();
    }
    public static EventTrigger generateTrigger() {
        return configuration.trigger();
    }
    public static EventTriggerParameter generateTriggerParameter() {
        return configuration.triggerParameter();
    }
}
