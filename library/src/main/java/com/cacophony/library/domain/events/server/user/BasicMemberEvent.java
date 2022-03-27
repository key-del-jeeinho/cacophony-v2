package com.cacophony.library.domain.events.server.user;

import com.cacophony.library.domain.event.common.data.EventOperation;
import com.cacophony.library.domain.object.server.Server;
import com.cacophony.library.domain.object.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BasicMemberEvent extends MemberEvent {
    private final Server server;
    private final User member;
    private final EventOperation operation;
}
