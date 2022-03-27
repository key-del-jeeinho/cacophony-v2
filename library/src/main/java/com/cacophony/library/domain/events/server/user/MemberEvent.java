package com.cacophony.library.domain.events.server.user;

import com.cacophony.library.domain.events.server.ServerEvent;
import com.cacophony.library.domain.object.user.User;

public abstract class MemberEvent extends ServerEvent {
    public abstract User getMember();
}
