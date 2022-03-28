package com.cacophony.library.event;

import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.event.common.configuration.ImmutableEventConfiguration;
import com.cacophony.library.domain.event.common.data.StandardEventType;
import com.cacophony.library.domain.event.common.configuration.StaticEventConfiguration;
import com.cacophony.library.domain.events.channel.basic.BasicChannelCreateEvent;
import com.cacophony.library.domain.events.channel.basic.server.ServerChannelCreateEvent;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class EventFlowTest {
    @Test
    public void testEventFlow() {
        ImmutableEventConfiguration configuration = new ImmutableEventConfiguration(true);
        StaticEventConfiguration.flow()
                .builder()
                .when(
                        StaticEventConfiguration.trigger()
                                .builder()
                                .trigger(parameter -> {
                                    System.out.println(parameter.getParameter("publishedAt", LocalDateTime.class));
                                    return true;
                                })
                                .build()
                ).doAction(
                        StaticEventConfiguration.action()
                                .builder()
                                .function(parameter -> System.out.println("테스트 - " + parameter.getParameter("event", Event.class).getType() + " - 입니다"))
                                .build()
                ).build()
                .execute(
                        StaticEventConfiguration.flowRequest()
                                .builder()
                                .event(new ServerChannelCreateEvent(()->23L))
                                .publishedAt(LocalDateTime.now())
                                .build()
                );
    }
}
