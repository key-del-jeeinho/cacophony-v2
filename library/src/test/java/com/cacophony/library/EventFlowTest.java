package com.cacophony.library;

import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.action.ImmutableEventAction;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.flow.ImmutableEventFlow;
import com.cacophony.library.domain.event.trigger.EventTrigger;
import com.cacophony.library.domain.event.trigger.ImmutableEventTrigger;
import org.junit.jupiter.api.Test;

public class EventFlowTest {
    @Test
    public void testFlow() {
        EventTrigger trigger = new ImmutableEventTrigger(parameter -> parameter.getParameter(0, Boolean.class));
        EventAction action = new ImmutableEventAction(parameter -> System.out.println(parameter.getParameter(0, String.class)));
        EventFlow flow = new ImmutableEventFlow()
                .builder()
                .when(trigger)
                .doAction(action)
                .complete();
        flow.execute(null);
    }
}
