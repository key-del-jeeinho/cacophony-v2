package com.cacophony.library.domain.events.channel;

import com.cacophony.library.domain.channel.ChannelType;
import com.cacophony.library.domain.event.common.data.EventOperation;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BasicChannelEvent extends ChannelEvent {
    private final EventOperation operation;
    private final Long channelId;
    private final ChannelType channelType;
}
