package com.cacophony.library;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.action.SimpleEventAction;
import com.cacophony.library.domain.event.action.parameter.EventActionParameter;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.flow.EventFlowRequest;
import com.cacophony.library.domain.event.flow.ImmutableEventFlow;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.domain.event.trigger.SimpleEventTrigger;
import com.cacophony.library.domain.event.trigger.parameter.EventTriggerParameter;
import org.junit.jupiter.api.Test;

public class EventFlowTest {
    @Test
    public void testFlow() {
        EventTrigger trigger = new SimpleEventTrigger(parameter -> parameter.getParameter(0, Boolean.class));
        EventAction action = new SimpleEventAction(parameter -> System.out.println(parameter.getParameter(1, String.class)));
        EventFlow flow = new ImmutableEventFlow()
                .builder()
                .when(trigger)
                .doAction(action)
                .complete();
        flow.execute(new EventFlowRequest() {
            @Override
            public EventActionParameter toActionParameter() {
                return new EventActionParameter() {
                    @Override
                    public EventActionParameterBuilder builder() {
                        return null;
                    }
                    @Override
                    public <T> T getParameter(Integer index, Class<T> clazz) {
                        return clazz.cast("안녕하세요");
                    }
                };
            }

            @Override
            public EventTriggerParameter toTriggerParameter() {
                return new EventTriggerParameter() {
                    @Override
                    public EventTriggerParameterBuilder builder() {
                        return null;
                    }

                    @Override
                    public <T> T getParameter(Integer index, Class<T> clazz) {
                        return clazz.cast(true);
                    }
                };
            }
        });
    }
}
