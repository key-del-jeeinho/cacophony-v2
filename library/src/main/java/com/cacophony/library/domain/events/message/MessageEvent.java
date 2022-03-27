package com.cacophony.library.domain.events.message;

import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import com.cacophony.library.domain.object.message.Message;
import com.cacophony.library.domain.object.message.MessageType;

public abstract class MessageEvent implements Event {
    @Override
    public EventType getType() {
        return StandardEventType.MESSAGE_EVENT;
    }

    public abstract Message getMessage();
    public abstract MessageType getMessageType();
}
