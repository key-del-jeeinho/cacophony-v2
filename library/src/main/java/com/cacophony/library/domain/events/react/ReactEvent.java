package com.cacophony.library.domain.events.react;

import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import com.cacophony.library.domain.object.react.React;

public abstract class ReactEvent implements Event {
    @Override
    public EventType getType() {
        return StandardEventType.REACT_EVENT;
    }

    public abstract React getReact();
}
