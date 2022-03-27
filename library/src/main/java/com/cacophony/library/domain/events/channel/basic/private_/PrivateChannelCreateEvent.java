package com.cacophony.library.domain.events.channel.basic.private_;

import com.cacophony.library.domain.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelCreateEvent;

public class PrivateChannelCreateEvent extends BasicChannelCreateEvent {
    public PrivateChannelCreateEvent(Long channelId) {
        super(channelId, ChannelType.PRIVATE);
    }
}
