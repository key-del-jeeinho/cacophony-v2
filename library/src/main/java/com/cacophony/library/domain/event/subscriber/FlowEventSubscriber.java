package com.cacophony.library.domain.event.subscriber;

import com.cacophony.library.domain.event.common.manager.StaticEventManager;
import com.cacophony.library.domain.event.flow.EventFlow;
import com.cacophony.library.domain.event.flow.request.EventFlowRequest;
import com.cacophony.library.domain.event.publisher.data.PublishEvent;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;

@RequiredArgsConstructor
public abstract class FlowEventSubscriber implements EventSubscriber {
    private final EventFlow flow;

    public FlowEventSubscriber() {
        this(null);
    }

    @Override
    public void call(PublishEvent data) {
        convert().andThen(just(flow::execute)).apply(data);
    }

    @Override
    public abstract FlowEventSubscriberBuilder builder();

    public interface FlowEventSubscriberBuilder extends EventSubscriberBuilder {
        FlowEventSubscriberBuilder flow(EventFlow flow);

        @Override
        FlowEventSubscriber build();
    }

    private Function<PublishEvent, EventFlowRequest> convert() {
        return data -> StaticEventManager.flowRequest()
                .builder()
                .publishedAt(LocalDateTime.now())
                .event(data.getData())
                .build();
    }

    //TODO FunctionalConverter 라이브러리 만들고 적용하기
    private static <T> Function<T, T> just(Consumer<T> consumer) {
        return arg -> {
            consumer.accept(arg);
            return arg;
        };
    }
}
