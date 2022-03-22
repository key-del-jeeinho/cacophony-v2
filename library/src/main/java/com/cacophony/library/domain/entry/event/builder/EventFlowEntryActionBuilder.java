package com.cacophony.library.domain.entry.event.builder;

import com.cacophony.library.domain.entry.event.EventFlowEntry;
import com.cacophony.library.domain.event.action.EventAction;
import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.trigger.EventTrigger;

import java.util.function.Consumer;

public abstract class EventFlowEntryActionBuilder extends EventFlowEntry {
    public EventFlowEntryActionBuilder(EventAction action, EventTrigger trigger) {
        super(action, trigger);
    }

    public EventFlowEntryActionBuilder and(Consumer<Event> doWhat) {
        return generate(parameter -> {
            action.execute(parameter);
            convert().andThen(just(doWhat)).apply(parameter);
        }, trigger);
    }

    public <T extends Event> CompletableEventFlowEntryTriggerBuilder when(Class<T> event) {
        return (CompletableEventFlowEntryTriggerBuilder) generate(parameter -> then(event).check(parameter), action);
    }
}
