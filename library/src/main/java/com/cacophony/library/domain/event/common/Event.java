package com.cacophony.library.domain.event.common;

import java.time.LocalDateTime;

public interface Event {
    LocalDateTime getPublishedAt();
}
