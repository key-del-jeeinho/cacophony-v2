package com.cacophony.library.domain.events.channel.basic;

import com.cacophony.library.domain.object.channel.Channel;
import com.cacophony.library.domain.object.channel.ChannelType;
import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.channel.BasicChannelEvent;

public class BasicChannelCreateEvent extends BasicChannelEvent {
    public BasicChannelCreateEvent(Channel channel, ChannelType channelType) {
        super(StandardEventOperation.CREATE, channel, channelType);
    }
}
