package com.cacophony.library.event;

import com.cacophony.library.domain.event.common.Event;
import com.cacophony.library.domain.event.common.ImmutableEventConfiguration;
import com.cacophony.library.domain.event.common.StandardEventType;
import com.cacophony.library.domain.event.common.StaticEventConfiguration;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class EventFlowTest {
    @Test
    public void testEventFlow() {
        ImmutableEventConfiguration configuration = new ImmutableEventConfiguration(true);
        StaticEventConfiguration.generateFlow()
                .builder()
                .when(
                        StaticEventConfiguration.generateTrigger()
                                .builder()
                                .trigger(parameter -> {
                                    System.out.println(parameter.getParameter("publishedAt", LocalDateTime.class));
                                    return true;
                                })
                                .build()
                ).doAction(
                        StaticEventConfiguration.generateAction()
                                .builder()
                                .function(parameter -> System.out.println("테스트 - " + parameter.getParameter("event", Event.class).getType() + " - 입니다"))
                                .build()
                ).complete()
                .execute(
                        StaticEventConfiguration.generateFlowRequest()
                                .builder()
                                .event(() -> StandardEventType.BOT_EVENT)
                                .publishedAt(LocalDateTime.now())
                                .build()
                );
    }
}
