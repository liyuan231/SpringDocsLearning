package com.liyuan.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Singleton
 */
public class CommandManager implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    private Command command;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    protected Command createCommand() {
        return this.applicationContext.getBean("command", Command.class);
    }

    public Command getCommand() {
        return createCommand();
    }

    @Override
    public String toString() {
        return "CommandManager{" +
                "applicationContext=" + applicationContext +
                ", command=" + createCommand() +
                '}';
    }

}
