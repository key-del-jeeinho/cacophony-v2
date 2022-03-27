package com.cacophony.library.domain.events.server.user.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.server.user.BasicMemberEvent;
import com.cacophony.library.domain.object.server.Server;
import com.cacophony.library.domain.object.user.User;

public class BasicMemberBanEvent extends BasicMemberEvent {
    public BasicMemberBanEvent(Server server, User member) {
        super(server, member, StandardEventOperation.CREATE);
    }
}
