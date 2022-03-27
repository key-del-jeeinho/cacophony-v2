package com.cacophony.library.domain.events.server.role.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.server.role.BasicRoleEvent;
import com.cacophony.library.domain.object.role.Role;
import com.cacophony.library.domain.object.server.Server;

public class BasicRoleDeleteEvent extends BasicRoleEvent {
    public BasicRoleDeleteEvent(Server server, Role role) {
        super(server, role, StandardEventOperation.DELETE);
    }
}
