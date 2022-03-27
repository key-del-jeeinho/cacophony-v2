package com.cacophony.library.domain.events.server;

import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import com.cacophony.library.domain.object.server.Server;

public abstract class ServerEvent implements Event {
    @Override
    public EventType getType() {
        return StandardEventType.SERVER_EVENT;
    }

    public abstract Server getServer();
}
