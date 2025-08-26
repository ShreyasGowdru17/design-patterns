package com.raksh.AbstractFactory;

public interface DBFactory {
    Connection createConnection();
    Command createCommand();
}
