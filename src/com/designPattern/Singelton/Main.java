package com.raksh.Singelton;
/*
Problem Statement — Thread-Safe Logger Singleton

You need to implement a Logger class that follows the Singleton pattern.

Requirements:

Only one instance of Logger should exist during the application’s lifetime.

It must be thread-safe — multiple threads trying to get the instance should still end up with the same one.

The Logger should have a method:

void log(String message)


which prints the message to the console with a timestamp.

Demonstrate your singleton by:

Creating multiple threads.

Each thread gets the Logger instance and writes different messages.

Show that all messages come from the same logger instance.

Expected Output Example:

[2025-08-10 19:45:32] [Logger@1a2b3c] Thread-1: Starting process...
[2025-08-10 19:45:32] [Logger@1a2b3c] Thread-2: Connecting to database...
[2025-08-10 19:45:33] [Logger@1a2b3c] Thread-3: Process completed.


Note: The [Logger@1a2b3c] shows the same memory reference for all messages.
 */
public class Main {

    public static void main(String[] args){

        Thread thread1=new Thread(){
            public void  run(){
                try{
                    Logger.getInstance().startProcess();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread thread2=new Thread(){
            public void  run(){
                try{
                    Logger.getInstance().connectToDatabase();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread thread3=new Thread(){
            public void  run(){
                try{
                   Logger.getInstance().terminateProcess();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        };

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
