package com.cn.command.pattern;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("nothing");
    }
}
