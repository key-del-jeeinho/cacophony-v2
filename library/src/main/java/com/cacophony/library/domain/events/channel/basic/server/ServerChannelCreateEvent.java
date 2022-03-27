package com.cacophony.library.domain.events.channel.basic.server;

import com.cacophony.library.domain.object.channel.Channel;
import com.cacophony.library.domain.object.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelCreateEvent;

public class ServerChannelCreateEvent extends BasicChannelCreateEvent {
    public ServerChannelCreateEvent(Channel channel) {
        super(channel, ChannelType.SERVER);
    }
}
