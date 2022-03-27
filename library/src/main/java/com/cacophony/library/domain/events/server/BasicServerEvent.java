package com.cacophony.library.domain.events.server;

import com.cacophony.library.domain.event.common.data.EventOperation;
import com.cacophony.library.domain.object.server.Server;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BasicServerEvent extends ServerEvent {
    private final Server server;
    private final EventOperation operation;
}
