package com.cacophony.library.domain.events.channel.basic.server;

import com.cacophony.library.domain.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelDeleteEvent;

public class ServerChannelDeleteEvent extends BasicChannelDeleteEvent {
    public ServerChannelDeleteEvent(Long channelId) {
        super(channelId, ChannelType.SERVER);
    }
}
