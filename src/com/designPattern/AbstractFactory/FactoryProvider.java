package com.raksh.AbstractFactory;

public class FactoryProvider {

    private FactoryProvider(){}
    public static DBFactory getFactory(String type){
        if("mysql".equalsIgnoreCase(type)){
            return MySQLFactory.getInstance();
        } else if ("postgresql".equalsIgnoreCase(type)) {
            return PostgreSQLFactory.getInstance();
        }
        throw new IllegalArgumentException("Unknown database type:"+type);
    }
}
