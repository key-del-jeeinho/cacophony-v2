package com.cacophony.library.event;

import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.common.manager.StandardEventManager;
import com.cacophony.library.domain.event.common.manager.StaticEventManager;
import com.cacophony.library.domain.events.channel.basic.server.ServerChannelCreateEvent;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class EventFlowTest {
    @Test
    public void testEventFlow() {
        StandardEventManager configuration = new StandardEventManager(true);
        StaticEventManager.flow()
                .builder()
                .when(
                        StaticEventManager.trigger()
                                .builder()
                                .trigger(parameter -> {
                                    System.out.println(parameter.getParameter("publishedAt", LocalDateTime.class));
                                    return true;
                                })
                                .build()
                ).doAction(
                        StaticEventManager.action()
                                .builder()
                                .function(parameter -> System.out.println("테스트 - " + parameter.getParameter("event", Event.class).getType() + " - 입니다"))
                                .build()
                ).build()
                .execute(
                        StaticEventManager.flowRequest()
                                .builder()
                                .event(new ServerChannelCreateEvent(()->23L))
                                .publishedAt(LocalDateTime.now())
                                .build()
                );
    }
}
