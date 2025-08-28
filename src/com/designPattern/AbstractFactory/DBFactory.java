package com.designPattern.AbstractFactory;

public interface DBFactory {
    Connection createConnection();
    Command createCommand();
}
