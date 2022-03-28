package com.cacophony.library.domain.events.server.user;

import com.cacophony.library.domain.event.common.data.EventType;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import com.cacophony.library.domain.events.server.ServerEvent;
import com.cacophony.library.global.object.user.User;

public abstract class MemberEvent extends ServerEvent {
    @Override
    public EventType getType() {
        return StandardEventType.MEMBER_EVENT;
    }

    public abstract User getMember();
}
