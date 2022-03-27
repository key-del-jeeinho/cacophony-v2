package com.cacophony.library.domain.events.channel.basic;

import com.cacophony.library.domain.object.channel.Channel;
import com.cacophony.library.domain.object.channel.ChannelType;
import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.channel.BasicChannelEvent;

public class BasicChannelDeleteEvent extends BasicChannelEvent {
    public BasicChannelDeleteEvent(Channel channel, ChannelType channelType) {
        super(StandardEventOperation.DELETE, channel, channelType);
    }
}
