package com.raksh.AbstractFactory;

public class PostgreSQLConnection implements Connection {
    @Override
    public void execute() {
        System.out.println("PostgreSQL connection established");
    }
}
