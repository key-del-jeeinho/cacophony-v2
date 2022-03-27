package com.cacophony.library.domain.events.role.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.role.BasicRoleEvent;
import com.cacophony.library.domain.object.role.Role;

public class BasicRoleDeleteEvent extends BasicRoleEvent {
    public BasicRoleDeleteEvent(Role role) {
        super(role, StandardEventOperation.DELETE);
    }
}
