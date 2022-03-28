package com.cacophony.library.domain.event.publisher;

import com.cacophony.library.domain.event.common.data.Event;
import com.cacophony.library.domain.publisher.PublishData;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PublishEvent implements PublishData<Event> {
    private final Event data;
}
