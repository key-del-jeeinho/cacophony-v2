package com.cacophony.library.domain.events.message;

import com.cacophony.library.domain.event.common.data.EventOperation;
import com.cacophony.library.domain.object.message.Message;
import com.cacophony.library.domain.object.message.MessageType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BasicMessageEvent extends MessageEvent {
    private final EventOperation operation;
    private final Message message;
    private final MessageType messageType;
}
