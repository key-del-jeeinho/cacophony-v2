package com.cacophony.library.domain.events.react.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.react.BasicReactEvent;
import com.cacophony.library.global.object.react.React;

public class BasicReactAddEvent extends BasicReactEvent {
    public BasicReactAddEvent(React react) {
        super(react, StandardEventOperation.CREATE);
    }
}
