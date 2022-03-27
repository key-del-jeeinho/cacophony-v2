package com.cacophony.library.domain.events.channel.basic.server;

import com.cacophony.library.domain.object.channel.Channel;
import com.cacophony.library.domain.object.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelUpdateEvent;

public class ServerChannelUpdateEvent extends BasicChannelUpdateEvent {
    public ServerChannelUpdateEvent(Channel channel) {
        super(channel, ChannelType.SERVER);
    }
}
