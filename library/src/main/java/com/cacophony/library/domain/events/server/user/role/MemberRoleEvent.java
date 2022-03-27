package com.cacophony.library.domain.events.server.user.role;

import com.cacophony.library.domain.events.server.user.MemberEvent;
import com.cacophony.library.domain.object.role.Role;

public abstract class MemberRoleEvent extends MemberEvent {
    public abstract Role getRole();
}
