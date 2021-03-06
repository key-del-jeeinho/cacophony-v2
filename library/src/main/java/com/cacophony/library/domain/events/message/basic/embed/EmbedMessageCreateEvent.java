package com.cacophony.library.domain.events.message.basic.embed;

import com.cacophony.library.domain.events.message.basic.BasicMessageCreateEvent;
import com.cacophony.library.global.object.message.Message;
import com.cacophony.library.global.object.message.MessageType;

public class EmbedMessageCreateEvent extends BasicMessageCreateEvent {
    public EmbedMessageCreateEvent(Message message) {
        super(message, MessageType.EMBED);
    }
}
