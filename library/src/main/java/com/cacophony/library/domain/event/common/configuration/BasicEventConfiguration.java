package com.cacophony.library.domain.event.common.configuration;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.action.EventActionGenerator;
import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.action.parameter.EventActionParameterGenerator;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.flow.EventFlowGenerator;
import com.cacophony.library.domain.event.flow.request.EventFlowRequest;
import com.cacophony.library.domain.event.flow.request.EventFlowRequestGenerator;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.domain.event.trigger.EventTriggerGenerator;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameterGenerator;

public class BasicEventConfiguration implements EventConfiguration{
    private final EventActionGenerator actionGenerator;
    private final EventActionParameterGenerator actionParameterGenerator;

    private final EventFlowGenerator flowGenerator;
    private final EventFlowRequestGenerator flowRequestGenerator;

    private final EventTriggerGenerator triggerGenerator;
    private final EventTriggerParameterGenerator triggerParameterGenerator;

    public BasicEventConfiguration(EventActionGenerator actionGenerator,
                                   EventActionParameterGenerator actionParameterGenerator,
                                   EventFlowGenerator flowGenerator,
                                   EventFlowRequestGenerator flowRequestGenerator,
                                   EventTriggerGenerator triggerGenerator,
                                   EventTriggerParameterGenerator triggerParameterGenerator,
                                   boolean isGlobalConfiguration) {
        this.actionGenerator = actionGenerator;
        this.actionParameterGenerator = actionParameterGenerator;
        this.flowGenerator = flowGenerator;
        this.flowRequestGenerator = flowRequestGenerator;
        this.triggerGenerator = triggerGenerator;
        this.triggerParameterGenerator = triggerParameterGenerator;

        if(isGlobalConfiguration) initStatic();
    }

    private void initStatic() {
        StaticEventConfiguration.init(this);
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
}
