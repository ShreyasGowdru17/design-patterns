package com.raksh.AbstractFactory;
/*
Problem Statement — Database Driver Factory Singleton

You are designing a system that connects to different types of databases (MySQL and PostgreSQL).

Requirements:

Singleton Behavior

There should be only one instance of the factory for the entire application lifetime.

The factory must be thread-safe.

Abstract Factory Pattern

Create an DBFactory interface with:

Connection createConnection();
Command createCommand();


Connection and Command are abstract product interfaces.

Concrete Factories

MySQLFactory (Singleton) — creates MySQL-specific Connection and Command objects.

PostgreSQLFactory (Singleton) — creates PostgreSQL-specific Connection and Command objects.

Products

MySQLConnection, PostgreSQLConnection

MySQLCommand, PostgreSQLCommand
Each should print messages like:

MySQL Connection established
PostgreSQL Command executed


Client Code

Based on a configuration string "mysql" or "postgresql", get the correct factory instance using a FactoryProvider (also Singleton).

Demonstrate that:

All calls for MySQL factory return the same instance.

All calls for PostgreSQL factory return the same instance.

Example Output:

MySQL Connection established
MySQL Command executed
MySQLFactory hash: 12345678

PostgreSQL Connection established
PostgreSQL Command executed
PostgreSQLFactory hash: 87654321
 */
/*
/**
 * As we know in factory pattern we took control of creating object and details by taking type.
 * Now you have to use factory when your application support different product families example Computer can be PC,Server or Assembled.
 * So what client needs to do is just pass the family of the product and that product will be built i.e. created.
 * Since we are dealing with creation of objects it is falling under creational design pattern.
 *
 * You ensure that when we say multiple product families , it should be related.
 *
 * A abstract factory contains main following :
 * 1. Abstract product class , in our case : Button and Checkbox
 * 2. Actual products that is MacButton,WinButton etc.
 * 3.  Abstract factory - which helps for interacting for creation and product factories will extend that to ensure right
 *      product gets created. - Here UIFactory
 * 4. Actual product factories - WinUIFactory , MacUIFactory
 * 5. Client - Application will take the respective factory and creates object, and then you can paint UI.
 *
 * Java lib example which is most famous that DOM Parser .It uses abstract factory pattern for creations.
 * The DocumentBuilderFactory is an abstract factory, a factory that is created as a new instance of DocumentBuilderFactory and the Document is an interface that is implemented by the factory to return the response.
 * We don't know here which type of DocumentBuilder we got but based on our input it has given correct instance.
 *
 * Reference example  : https://refactoring.guru/design-patterns/abstract-factory/java/example
 */
public class Main {

    public static void main(String[] args){
        DBFactory factory= FactoryProvider.getFactory("POSTGRESQL");
        new Factory(factory).execute();
    }

}
