package com.cacophony.library.domain.events.channel.basic.server;

import com.cacophony.library.domain.object.channel.Channel;
import com.cacophony.library.domain.object.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelDeleteEvent;

public class ServerChannelDeleteEvent extends BasicChannelDeleteEvent {
    public ServerChannelDeleteEvent(Channel channel) {
        super(channel, ChannelType.SERVER);
    }
}
