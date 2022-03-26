package com.cacophony.library.global.flow;

import com.cacophony.library.global.Buildable;
import com.cacophony.library.global.action.Action;
import com.cacophony.library.global.flow.request.FlowRequest;
import com.cacophony.library.global.trigger.Trigger;

public interface Flow<B extends Flow.FlowBuilder<?, ?>, R extends FlowRequest<?, ?>> {
    B builder();

    void execute(R e);

    interface FlowBuilder<T extends Trigger<?>, A extends Action<?>> extends Buildable<Flow<?, ?>> {
        FlowBuilder<T, A> when(T trigger);
        FlowBuilder<T, A> doAction(A action);
        @Override
        Flow<?, ?> build();
    }
}
