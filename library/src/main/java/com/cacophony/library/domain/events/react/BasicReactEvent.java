package com.cacophony.library.domain.events.react;

import com.cacophony.library.domain.event.common.data.EventOperation;
import com.cacophony.library.domain.object.react.React;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BasicReactEvent extends ReactEvent {
    private final React react;
    private final EventOperation operation;
}
