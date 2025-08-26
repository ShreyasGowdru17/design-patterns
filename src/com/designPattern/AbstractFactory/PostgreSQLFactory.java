package com.raksh.AbstractFactory;

public class PostgreSQLFactory implements DBFactory {

    private static PostgreSQLFactory postgreSQLFactory=null;

    private PostgreSQLFactory(){}

    public static PostgreSQLFactory getInstance(){
        if(postgreSQLFactory==null){

            synchronized (PostgreSQLFactory.class){
                if(postgreSQLFactory==null){
                    postgreSQLFactory=new PostgreSQLFactory();
                }
            }
        }
        return postgreSQLFactory;
    }
    @Override
    public Connection createConnection() {
        return new PostgreSQLConnection();
    }

    @Override
    public Command createCommand() {
        return new PostgreSQLCommand();
    }

    @Override
    public String toString() {
        return "PostgreSQLFactory";
    }
}
