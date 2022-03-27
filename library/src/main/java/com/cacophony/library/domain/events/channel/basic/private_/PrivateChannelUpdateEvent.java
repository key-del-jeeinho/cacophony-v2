package com.cacophony.library.domain.events.channel.basic.private_;

import com.cacophony.library.domain.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelUpdateEvent;

public class PrivateChannelUpdateEvent extends BasicChannelUpdateEvent {
    public PrivateChannelUpdateEvent(Long channelId) {
        super(channelId, ChannelType.PRIVATE);
    }
}
