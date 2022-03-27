package com.cacophony.library.domain.events.message.basic.embed;

import com.cacophony.library.domain.events.message.basic.BasicMessageDeleteEvent;
import com.cacophony.library.domain.object.message.Message;
import com.cacophony.library.domain.object.message.MessageType;

public class EmbedMessageDeleteEvent extends BasicMessageDeleteEvent {
    public EmbedMessageDeleteEvent(Message message) {
        super(message, MessageType.EMBED);
    }
}
