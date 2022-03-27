package com.cacophony.library.domain.events.role;

import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import com.cacophony.library.domain.object.role.Role;

public abstract class RoleEvent implements Event {
    @Override
    public EventType getType() {
        return StandardEventType.ROLE_EVENT;
    }

    public abstract Role getRole();
}
