package com.cacophony.library.domain.events.message.basic.text;

import com.cacophony.library.domain.events.message.basic.BasicMessageCreateEvent;
import com.cacophony.library.global.object.message.Message;
import com.cacophony.library.global.object.message.MessageType;

public class TextMessageCreateEvent extends BasicMessageCreateEvent {
    public TextMessageCreateEvent(Message message) {
        super(message, MessageType.TEXT);
    }
}
