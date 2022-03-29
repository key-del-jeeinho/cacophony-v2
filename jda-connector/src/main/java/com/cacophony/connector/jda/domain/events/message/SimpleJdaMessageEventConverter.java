package com.cacophony.connector.jda.domain.events.message;

import com.cacophony.library.domain.events.message.basic.text.TextMessageCreateEvent;
import com.cacophony.library.domain.events.message.basic.text.TextMessageDeleteEvent;
import com.cacophony.library.domain.events.message.basic.text.TextMessageUpdateEvent;
import net.dv8tion.jda.api.events.message.MessageDeleteEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.MessageUpdateEvent;

public class SimpleJdaMessageEventConverter implements JdaMessageEventConverter {
    @Override
    public TextMessageCreateEvent convert(MessageReceivedEvent event) {
        return new TextMessageCreateEvent(event::getMessageId);
    }

    @Override
    public TextMessageDeleteEvent convert(MessageDeleteEvent event) {
        return new TextMessageDeleteEvent(event::getMessageId);
    }

    @Override
    public TextMessageUpdateEvent convert(MessageUpdateEvent event) {
        return new TextMessageUpdateEvent(event::getMessageId);
    }
}
