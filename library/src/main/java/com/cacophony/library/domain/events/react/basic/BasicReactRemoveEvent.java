package com.cacophony.library.domain.events.react.basic;

import com.cacophony.library.domain.event.common.data.EventOperation;
import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.react.BasicReactEvent;
import com.cacophony.library.domain.object.react.React;

public class BasicReactRemoveEvent extends BasicReactEvent {
    public BasicReactRemoveEvent(React react, EventOperation operation) {
        super(react, StandardEventOperation.DELETE);
    }
}
