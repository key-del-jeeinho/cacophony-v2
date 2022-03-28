package com.cacophony.library.domain.events.channel.basic.private_;

import com.cacophony.library.global.object.channel.Channel;
import com.cacophony.library.global.object.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelUpdateEvent;

public class PrivateChannelUpdateEvent extends BasicChannelUpdateEvent {
    public PrivateChannelUpdateEvent(Channel channel) {
        super(channel, ChannelType.PRIVATE);
    }
}
