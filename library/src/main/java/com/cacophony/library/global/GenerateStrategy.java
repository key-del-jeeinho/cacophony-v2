package com.cacophony.library.global;

@FunctionalInterface
public interface GenerateStrategy<T> {
    T generate();
}
