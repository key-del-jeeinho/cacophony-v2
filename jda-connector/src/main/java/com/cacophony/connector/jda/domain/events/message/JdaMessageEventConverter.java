package com.cacophony.connector.jda.domain.events.message;

import com.cacophony.library.domain.events.message.basic.text.TextMessageCreateEvent;
import com.cacophony.library.domain.events.message.basic.text.TextMessageDeleteEvent;
import com.cacophony.library.domain.events.message.basic.text.TextMessageUpdateEvent;
import net.dv8tion.jda.api.events.message.MessageDeleteEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.MessageUpdateEvent;

public interface JdaMessageEventConverter {
    //TODO EmbedMessageCreateEvent convert();
    //TODO EmbedMessageDeleteEvent convert();
    //TODO EmbedMessageUpdateEvent convert();
    TextMessageCreateEvent convert(MessageReceivedEvent event);
    TextMessageDeleteEvent convert(MessageDeleteEvent event);
    TextMessageUpdateEvent convert(MessageUpdateEvent event);
}
