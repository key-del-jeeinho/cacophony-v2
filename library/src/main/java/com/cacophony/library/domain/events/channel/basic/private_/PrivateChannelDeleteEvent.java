package com.cacophony.library.domain.events.channel.basic.private_;

import com.cacophony.library.global.object.channel.Channel;
import com.cacophony.library.global.object.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelDeleteEvent;

public class PrivateChannelDeleteEvent extends BasicChannelDeleteEvent {
    public PrivateChannelDeleteEvent(Channel channel) {
        super(channel, ChannelType.PRIVATE);
    }
}
