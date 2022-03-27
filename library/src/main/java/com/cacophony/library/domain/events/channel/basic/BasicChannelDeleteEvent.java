package com.cacophony.library.domain.events.channel.basic;

import com.cacophony.library.domain.channel.ChannelType;
import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.channel.BasicChannelEvent;

public class BasicChannelDeleteEvent extends BasicChannelEvent {
    public BasicChannelDeleteEvent(Long channelId, ChannelType channelType) {
        super(StandardEventOperation.DELETE, channelId, channelType);
    }
}
