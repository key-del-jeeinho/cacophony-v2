package com.cacophony.library.domain.events.server.role;

import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import com.cacophony.library.domain.events.server.ServerEvent;
import com.cacophony.library.global.object.role.Role;

public abstract class RoleEvent extends ServerEvent {
    @Override
    public EventType getType() {
        return StandardEventType.ROLE_EVENT;
    }

    public abstract Role getRole();
}
