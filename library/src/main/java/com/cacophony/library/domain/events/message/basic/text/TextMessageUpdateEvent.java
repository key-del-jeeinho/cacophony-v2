package com.cacophony.library.domain.events.message.basic.text;

import com.cacophony.library.domain.events.message.basic.BasicMessageUpdateEvent;
import com.cacophony.library.global.object.message.Message;
import com.cacophony.library.global.object.message.MessageType;

public class TextMessageUpdateEvent extends BasicMessageUpdateEvent {
    public TextMessageUpdateEvent(Message message) {
        super(message, MessageType.TEXT);
    }
}
