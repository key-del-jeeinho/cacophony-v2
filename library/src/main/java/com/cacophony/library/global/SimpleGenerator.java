package com.cacophony.library.global;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class SimpleGenerator<T> implements Generator<T>{
    protected final GenerateStrategy<T> generateStrategy;

    @Override
    public T generateDefault() {
        return generateStrategy.generate();
    }
}
