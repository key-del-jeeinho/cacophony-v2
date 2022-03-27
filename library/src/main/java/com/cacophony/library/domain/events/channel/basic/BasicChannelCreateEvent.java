package com.cacophony.library.domain.events.channel.basic;

import com.cacophony.library.domain.channel.ChannelType;
import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.channel.BasicChannelEvent;

public class BasicChannelCreateEvent extends BasicChannelEvent {
    public BasicChannelCreateEvent( Long channelId, ChannelType channelType) {
        super(StandardEventOperation.CREATE, channelId, channelType);
    }
}
