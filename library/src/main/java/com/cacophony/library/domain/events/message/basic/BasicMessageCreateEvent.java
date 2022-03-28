package com.cacophony.library.domain.events.message.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.message.BasicMessageEvent;
import com.cacophony.library.global.object.message.Message;
import com.cacophony.library.global.object.message.MessageType;

public class BasicMessageCreateEvent extends BasicMessageEvent {
    public BasicMessageCreateEvent(Message message, MessageType messageType) {
        super(StandardEventOperation.CREATE, message, messageType);
    }
}
