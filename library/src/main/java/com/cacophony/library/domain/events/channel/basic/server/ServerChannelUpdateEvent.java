package com.cacophony.library.domain.events.channel.basic.server;

import com.cacophony.library.domain.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelUpdateEvent;

public class ServerChannelUpdateEvent extends BasicChannelUpdateEvent {
    public ServerChannelUpdateEvent(Long channelId) {
        super(channelId, ChannelType.SERVER);
    }
}
