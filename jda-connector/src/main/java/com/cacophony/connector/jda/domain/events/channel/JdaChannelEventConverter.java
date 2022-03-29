package com.cacophony.connector.jda.domain.events.channel;

import com.cacophony.library.domain.events.channel.basic.private_.PrivateChannelCreateEvent;
import com.cacophony.library.domain.events.channel.basic.private_.PrivateChannelDeleteEvent;
import com.cacophony.library.domain.events.channel.basic.server.ServerChannelCreateEvent;
import com.cacophony.library.domain.events.channel.basic.server.ServerChannelDeleteEvent;
import com.cacophony.library.domain.events.channel.basic.server.ServerChannelUpdateEvent;
import net.dv8tion.jda.api.events.channel.text.TextChannelCreateEvent;
import net.dv8tion.jda.api.events.channel.text.TextChannelDeleteEvent;
import net.dv8tion.jda.api.events.channel.text.update.GenericTextChannelUpdateEvent;

public interface JdaChannelEventConverter {
    ServerChannelCreateEvent convert(TextChannelCreateEvent event);
    ServerChannelUpdateEvent convert(GenericTextChannelUpdateEvent<?> event);
    ServerChannelDeleteEvent convert(TextChannelDeleteEvent event);
    @Deprecated
    PrivateChannelCreateEvent convert(net.dv8tion.jda.api.events.channel.priv.PrivateChannelCreateEvent event);
    @Deprecated
    PrivateChannelDeleteEvent convert(net.dv8tion.jda.api.events.channel.priv.PrivateChannelDeleteEvent event);


}
