package com.cacophony.library.domain.events.message.basic.embed;

import com.cacophony.library.domain.events.message.basic.BasicMessageUpdateEvent;
import com.cacophony.library.domain.object.message.Message;
import com.cacophony.library.domain.object.message.MessageType;

public class EmbedMessageUpdateEvent extends BasicMessageUpdateEvent {
    public EmbedMessageUpdateEvent(Message message) {
        super(message, MessageType.EMBED);
    }
}
