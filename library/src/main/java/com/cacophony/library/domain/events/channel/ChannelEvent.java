package com.cacophony.library.domain.events.channel;

import com.cacophony.library.domain.object.channel.Channel;
import com.cacophony.library.domain.object.channel.ChannelType;
import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;

public abstract class ChannelEvent implements Event {
    @Override
    public EventType getType() {
        return StandardEventType.CHANNEL_EVENT;
    }

    public abstract Channel getChannel();
    public abstract ChannelType getChannelType();
}
