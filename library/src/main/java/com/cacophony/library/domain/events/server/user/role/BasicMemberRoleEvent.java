package com.cacophony.library.domain.events.server.user.role;

import com.cacophony.library.domain.event.common.data.EventOperation;
import com.cacophony.library.domain.object.role.Role;
import com.cacophony.library.domain.object.server.Server;
import com.cacophony.library.domain.object.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BasicMemberRoleEvent extends MemberRoleEvent {
    private final EventOperation operation;
    private final Server server;
    private final User member;
    private final Role role;
}
