package com.designPattern.AbstractFactory;

public class Factory {

    private Command command;
    private Connection connection;
    private DBFactory factory;

    public Factory(DBFactory factory){
        command=factory.createCommand();
        connection= factory.createConnection();
        this.factory=factory;
    }

    public void execute(){
        connection.execute();
        command.execute();
        System.out.println(factory.toString()+" "+"hash"+" "+factory.hashCode());
    }
}
