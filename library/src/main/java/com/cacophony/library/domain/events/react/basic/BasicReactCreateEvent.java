package com.cacophony.library.domain.events.react.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.react.BasicReactEvent;
import com.cacophony.library.domain.object.react.React;

public class BasicReactCreateEvent extends BasicReactEvent {
    public BasicReactCreateEvent(React react) {
        super(react, StandardEventOperation.CREATE);
    }
}
