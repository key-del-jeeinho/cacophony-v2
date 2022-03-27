package com.cacophony.library.domain.events.message.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.message.BasicMessageEvent;
import com.cacophony.library.domain.object.message.Message;
import com.cacophony.library.domain.object.message.MessageType;

public class BasicMessageUpdateEvent extends BasicMessageEvent {
    public BasicMessageUpdateEvent(Message message, MessageType messageType) {
        super(StandardEventOperation.UPDATE, message, messageType);
    }
}
