package com.designPattern.Singelton;

import java.time.LocalDate;

public class Logger {

    private static Logger logger=null;
    private Logger(){}

    public static Logger getInstance(){
        if(logger==null){
            synchronized (Logger.class){
                if(logger==null){
                    logger=new Logger();
                }
            }
        }
        return logger;
    }

    public void startProcess(){
        System.out.println("["+LocalDate.now()+"] "+"["+logger.hashCode()+"]"+" "+Thread.currentThread().getName()+":"+"Starting process...");
    }

    public void connectToDatabase(){
        System.out.println("["+LocalDate.now()+"] "+"["+logger.hashCode()+"]"+" "+Thread.currentThread().getName()+":"+"Connecting to database...");
    }

    public void terminateProcess(){
        System.out.println("["+LocalDate.now()+"] "+"["+logger.hashCode()+"]"+" "+Thread.currentThread().getName()+":"+"Process completed...");
    }
}
