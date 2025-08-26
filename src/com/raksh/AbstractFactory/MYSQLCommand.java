package com.raksh.AbstractFactory;

public class MYSQLCommand implements Command {
    @Override
    public void execute() {
        System.out.println("MYSQL Command Executed");
    }
}
