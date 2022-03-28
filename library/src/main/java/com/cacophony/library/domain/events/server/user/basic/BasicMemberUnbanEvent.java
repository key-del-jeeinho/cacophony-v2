package com.cacophony.library.domain.events.server.user.basic;

import com.cacophony.library.domain.event.common.data.StandardEventOperation;
import com.cacophony.library.domain.events.server.user.BasicMemberEvent;
import com.cacophony.library.global.object.server.Server;
import com.cacophony.library.global.object.user.User;

public class BasicMemberUnbanEvent extends BasicMemberEvent {

    public BasicMemberUnbanEvent(Server server, User member) {
        super(server, member, StandardEventOperation.DELETE);
    }
}
