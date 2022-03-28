package com.cacophony.library.domain.events.channel.basic;

import com.cacophony.library.global.object.channel.Channel;
import com.cacophony.library.global.object.channel.ChannelType;
import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.channel.BasicChannelEvent;

public class BasicChannelUpdateEvent extends BasicChannelEvent {
    public BasicChannelUpdateEvent(Channel channel, ChannelType channelType) {
        super(StandardEventOperation.UPDATE, channel, channelType);
    }
}
