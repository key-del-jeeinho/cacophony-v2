package com.cacophony.library.domain.events.server.user.role.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.server.user.role.BasicMemberRoleEvent;
import com.cacophony.library.global.object.role.Role;
import com.cacophony.library.global.object.server.Server;
import com.cacophony.library.global.object.user.User;

public class BasicMemberRoleRemoveEvent extends BasicMemberRoleEvent {
    public BasicMemberRoleRemoveEvent(Server server, User user, Role role) {
        super(StandardEventOperation.DELETE, server, user, role);
    }
}
