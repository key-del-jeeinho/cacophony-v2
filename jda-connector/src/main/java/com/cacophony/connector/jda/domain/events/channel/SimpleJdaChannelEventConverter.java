package com.cacophony.connector.jda.domain.events.channel;

import com.cacophony.library.domain.events.channel.basic.private_.PrivateChannelCreateEvent;
import com.cacophony.library.domain.events.channel.basic.private_.PrivateChannelDeleteEvent;
import com.cacophony.library.domain.events.channel.basic.server.ServerChannelCreateEvent;
import com.cacophony.library.domain.events.channel.basic.server.ServerChannelDeleteEvent;
import com.cacophony.library.domain.events.channel.basic.server.ServerChannelUpdateEvent;
import net.dv8tion.jda.api.events.channel.text.GenericTextChannelEvent;
import net.dv8tion.jda.api.events.channel.text.TextChannelCreateEvent;
import net.dv8tion.jda.api.events.channel.text.TextChannelDeleteEvent;
import net.dv8tion.jda.api.events.channel.text.update.GenericTextChannelUpdateEvent;

public class SimpleJdaChannelEventConverter implements JdaChannelEventConverter {
    @Override
    public ServerChannelCreateEvent convert(TextChannelCreateEvent event) {
        return new ServerChannelCreateEvent(() -> getChannelId(event));
    }

    @Override
    public ServerChannelUpdateEvent convert(GenericTextChannelUpdateEvent<?> event) {
        return new ServerChannelUpdateEvent(() -> getChannelId(event));
    }

    @Override
    public ServerChannelDeleteEvent convert(TextChannelDeleteEvent event) {
        return new ServerChannelDeleteEvent(() -> getChannelId(event));
    }

    @Override
    public PrivateChannelCreateEvent convert(net.dv8tion.jda.api.events.channel.priv.PrivateChannelCreateEvent event) {
        return new PrivateChannelCreateEvent(() -> getChannelId(event));
    }

    @Override
    public PrivateChannelDeleteEvent convert(net.dv8tion.jda.api.events.channel.priv.PrivateChannelDeleteEvent event) {
        return new PrivateChannelDeleteEvent(() -> getChannelId(event));
    }

    private String getChannelId(net.dv8tion.jda.api.events.channel.priv.PrivateChannelCreateEvent event) {
        return event.getChannel().getId();
    }
    private String getChannelId(net.dv8tion.jda.api.events.channel.priv.PrivateChannelDeleteEvent event) {
        return event.getChannel().getId();
    }
    private String getChannelId(GenericTextChannelEvent event) {
        return event.getChannel().getId();
    }
}
