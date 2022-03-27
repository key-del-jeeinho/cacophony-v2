package com.cacophony.library.domain.events.server.user.role.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.server.user.role.BasicMemberRoleEvent;
import com.cacophony.library.domain.object.role.Role;
import com.cacophony.library.domain.object.server.Server;
import com.cacophony.library.domain.object.user.User;

public class BasicMemberRoleAddEvent extends BasicMemberRoleEvent {
    public BasicMemberRoleAddEvent(Server server, User user, Role role) {
        super(StandardEventOperation.CREATE, server, user, role);
    }
}
