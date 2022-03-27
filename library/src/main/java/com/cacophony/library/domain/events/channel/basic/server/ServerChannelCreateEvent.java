package com.cacophony.library.domain.events.channel.basic.server;

import com.cacophony.library.domain.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelCreateEvent;

public class ServerChannelCreateEvent extends BasicChannelCreateEvent {
    public ServerChannelCreateEvent(Long channelId) {
        super(channelId, ChannelType.SERVER);
    }
}
