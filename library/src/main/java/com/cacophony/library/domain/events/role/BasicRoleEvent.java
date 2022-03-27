package com.cacophony.library.domain.events.role;

import com.cacophony.library.domain.event.common.data.EventOperation;
import com.cacophony.library.domain.object.role.Role;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BasicRoleEvent extends RoleEvent {
    private final Role role;
    private final EventOperation operation;
}
