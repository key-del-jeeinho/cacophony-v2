package com.cacophony.library.domain.events.channel.basic.private_;

import com.cacophony.library.global.object.channel.Channel;
import com.cacophony.library.global.object.channel.ChannelType;
import com.cacophony.library.domain.events.channel.basic.BasicChannelCreateEvent;

public class PrivateChannelCreateEvent extends BasicChannelCreateEvent {
    public PrivateChannelCreateEvent(Channel channel) {
        super(channel, ChannelType.PRIVATE);
    }
}
