package com.cacophony.library.domain.entry.event.builder;

import com.cacophony.library.domain.entry.event.EventFlowEntry;
import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.trigger.EventTrigger;

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
}
