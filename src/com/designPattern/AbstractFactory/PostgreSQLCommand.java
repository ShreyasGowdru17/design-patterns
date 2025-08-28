package com.designPattern.AbstractFactory;

public class PostgreSQLCommand implements Command {
    @Override
    public void execute() {
        System.out.println("PostgreSQL command executed");
    }
}
