package com.cacophony.library.domain.events.server.role;

import com.cacophony.library.domain.event.common.data.EventOperation;
import com.cacophony.library.global.object.role.Role;
import com.cacophony.library.global.object.server.Server;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BasicRoleEvent extends RoleEvent {
    private final Server server;
    private final Role role;
    private final EventOperation operation;
}
