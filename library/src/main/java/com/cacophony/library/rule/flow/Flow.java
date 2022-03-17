package com.cacophony.library.rule.flow;

import com.cacophony.library.rule.action.Action;
import com.cacophony.library.rule.trigger.Trigger;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Flow {
    private final Trigger trigger;
    private final Action action;
    
    public abstract Flow when(Trigger trigger);
    public abstract Flow doAction(Action action);
    public abstract Flow complete();
}
