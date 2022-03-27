package com.cacophony.library.domain.events.channel.basic;

import com.cacophony.library.domain.channel.ChannelType;
import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.channel.BasicChannelEvent;

public class BasicChannelUpdateEvent extends BasicChannelEvent {
    public BasicChannelUpdateEvent(Long channelId, ChannelType channelType) {
        super(StandardEventOperation.UPDATE, channelId, channelType);
    }
}
