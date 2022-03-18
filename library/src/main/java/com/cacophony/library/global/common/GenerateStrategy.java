package com.cacophony.library.global.common;

@FunctionalInterface
public interface GenerateStrategy<T> {
    T generate();
}
