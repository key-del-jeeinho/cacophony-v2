package com.cacophony.library.domain.events.message.basic.text;

import com.cacophony.library.domain.events.message.basic.BasicMessageDeleteEvent;
import com.cacophony.library.domain.object.message.Message;
import com.cacophony.library.domain.object.message.MessageType;

public class TextMessageDeleteEvent extends BasicMessageDeleteEvent {
    public TextMessageDeleteEvent(Message message) {
        super(message, MessageType.TEXT);
    }
}
