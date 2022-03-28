package com.cacophony.library.domain.events.server.user.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.server.user.BasicMemberEvent;
import com.cacophony.library.global.object.server.Server;
import com.cacophony.library.global.object.user.User;

public class BasicMemberQuitEvent extends BasicMemberEvent {

    public BasicMemberQuitEvent(Server server, User member) {
        super(server, member, StandardEventOperation.DELETE);
    }
}
