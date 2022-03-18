package com.cacophony.library.global.action;

import com.cacophony.library.global.GenerateStrategy;
import com.cacophony.library.global.SimpleGenerator;

public class ActionGenerator extends SimpleGenerator<Action> {
    public ActionGenerator(GenerateStrategy<Action> generateStrategy) {
        super(generateStrategy);
    }
}
