package com.cacophony.library.domain.events.channel.basic.private_;

import com.cacophony.library.domain.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelDeleteEvent;

public class PrivateChannelDeleteEvent extends BasicChannelDeleteEvent {
    public PrivateChannelDeleteEvent(Long channelId) {
        super(channelId, ChannelType.PRIVATE);
    }
}
