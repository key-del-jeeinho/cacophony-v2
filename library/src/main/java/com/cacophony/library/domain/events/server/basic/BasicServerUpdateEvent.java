package com.cacophony.library.domain.events.server.basic;

import com.cacophony.library.domain.event.common.data.EventOperation;
import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.server.BasicServerEvent;
import com.cacophony.library.domain.object.server.Server;

public class BasicServerUpdateEvent extends BasicServerEvent {
    public BasicServerUpdateEvent(Server server, EventOperation operation) {
        super(server, StandardEventOperation.UPDATE);
    }
}
