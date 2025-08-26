package com.raksh.AbstractFactory;

public class MySQLFactory implements DBFactory {

    private static MySQLFactory mySQLFactory=null;
    private  MySQLFactory(){}

    public static MySQLFactory getInstance(){
        if(mySQLFactory==null){
            synchronized (MySQLFactory.class){
                if(mySQLFactory==null){
                    mySQLFactory=new MySQLFactory();
                }
            }
        }
        return mySQLFactory;
    }
    @Override
    public Connection createConnection() {
        return new MYSQLConnection();
    }

    @Override
    public Command createCommand() {
        return new MYSQLCommand();
    }

    @Override
    public String toString() {
        return "MySQLFactory";
    }
}
