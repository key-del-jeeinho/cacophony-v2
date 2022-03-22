package com.cacophony.library.domain.entry.event.builder;

import com.cacophony.library.domain.entry.event.EventFlowEntry;
import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.common.*;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.flow.request.EventFlowRequest;
import com.cacophony.library.domain.event.trigger.EventTrigger;

import java.time.LocalDateTime;
import java.util.function.Consumer;

public abstract class EventFlowEntryTriggerBuilder extends EventFlowEntry {
    public EventFlowEntryTriggerBuilder(EventAction action, EventTrigger trigger) {
        super(action, trigger);
    }

    public <T extends Event> EventFlowEntryTriggerBuilder and(Class<T> event) {
        return generate(parameter -> trigger.check(parameter) || then(event).check(parameter), action);
    }

    public CompletableEventFlowEntryActionBuilder doAction(Consumer<Event> doWhat) {
        return (CompletableEventFlowEntryActionBuilder) generate(convert().andThen(just(doWhat))::apply, trigger);
    }

    static class AEvent implements Event {
        @Override
        public EventType getType() {
            return StandardEventType.ROLE_EVENT;
        }
    }
    static class BEvent implements Event {
        @Override
        public EventType getType() {
            return StandardEventType.EMOTE_EVENT;
        }
    }
    static class CEvent implements Event {
        @Override
        public EventType getType() {
            return StandardEventType.EMOTE_EVENT;
        }
    }
}
