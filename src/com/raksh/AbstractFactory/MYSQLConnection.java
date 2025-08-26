package com.raksh.AbstractFactory;

public class MYSQLConnection implements Connection {
    @Override
    public void execute() {
        System.out.println("MYSQL Connection Established");
    }
}
