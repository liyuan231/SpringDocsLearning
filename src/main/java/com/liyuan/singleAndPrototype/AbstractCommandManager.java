package com.liyuan.singleAndPrototype;

import com.liyuan.model.Command;
import com.liyuan.model.CommandManager;
import org.springframework.beans.factory.annotation.Lookup;

import java.util.Map;

public abstract class AbstractCommandManager extends CommandManager {
    public Object process(Object commandState) {
        // grab a new instance of the appropriate Command interface
        Command command = createCommand();
        // set the state on the (hopefully brand new) Command instance
        command.setState((Map) commandState);
        return command.execute();
    }

    // okay... but where is the implementation of this method?
    @Lookup("command")
    protected abstract Command createCommand();
}
