package com.designPattern.Builder.singelton;

import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        ConfigurationManager configurationManager=new ConfigurationManager.Builder()
                .dbUrl("jdbc:mysql://localhost:3306/mydb")
                .maxConnections(10)
                .timeout(2000)
                .loggingLevel(Type.INFO)
                .featureToggles(List.of("X","Y"))
                .build();
        ConfigurationManager configurationManager1=new ConfigurationManager.Builder()
                .dbUrl("jdbc:mysql://localhost:3306/mydb")
                .maxConnections(70)
                .timeout(4000)
                .loggingLevel(Type.DEBUG)
                .build();
        System.out.println(configurationManager);
        System.out.println(configurationManager1);
    }}
