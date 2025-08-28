package com.designPattern.Decorator;
/*
🏆 Hard Question: Decorator Pattern

### Problem Statement

You are designing a **Coffee Ordering System** for a café. Customers can order a **base coffee** and then add multiple **toppings (decorators)** like Milk, Sugar, Mocha, Whipped Cream, Caramel, etc.

* A `Coffee` has the following responsibilities:

  * `String getDescription()` → returns the description of the coffee with toppings.
  * `double getCost()` → returns the total cost of the coffee including toppings.

* Base coffee types include:

  * `Espresso` (cost: \$3.0)
  * `Latte` (cost: \$4.0)

* Toppings (decorators) include:

  * Milk (+\$0.5)
  * Sugar (+\$0.2)
  * Mocha (+\$0.7)
  * Whipped Cream (+\$1.0)
  * Caramel (+\$0.8)

Each topping should **wrap around** a `Coffee` object and enhance both description and cost. Multiple toppings can be added in any order.

---

### Constraints & Validation

1. A coffee **must have at least one base type** (`Espresso` or `Latte`).
2. Toppings are optional but can be combined in any order.
3. Ensure that adding decorators doesn’t break immutability (each decorated object is independent).
4. You should follow **Decorator Pattern strictly**, i.e., toppings must extend a `CoffeeDecorator` that itself implements/extends `Coffee`.

---

### Example 1

**Input:**

```
Order: Espresso + Milk + Mocha
```

**Output:**

```
Description: Espresso, Milk, Mocha
Cost: 4.2
```

---

### Example 2

**Input:**

```
Order: Latte + Sugar + Caramel + Whipped Cream
```

**Output:**

```
Description: Latte, Sugar, Caramel, Whipped Cream
Cost: 6.0
```

---

### Example 3

**Input:**

```
Order: Espresso
```

**Output:**

```
Description: Espresso
Cost: 3.0
*/
/*
 * Decorator - It is a design pattern categorized in structural pattern. It helps to decorate the object meaning
 * It basically keeps expanding behaviour of the object.The decorator design pattern is used to change an object’s functionality during runtime.
 * Other instances of the same class will be unaffected, therefore each object will have its behavior changed.
 *
 * Since we can keep supporting adding new decorator we are getting dynamic object extension.
 * After all we are creating stack of wrapper , certain system becomes so coupled that it becomes difficult to
 * remove certain decorators.
 *
 * Inheritance also helps to expand the functionality but that is at compiletime not at runtime.
 * One of the best example of decorator is customized pizza. Where you have pizza and you have different decorator
 * like addExtraChese, cheeseburst, olives yes, jalepeno yes. We keep adding topups and we finally get pizza.
 *
 * You can also think of Account -> Saving Account -> Salary Account -> Preferred Account.
 * Where base is Account now based on different accounttype it keeps adding new features and offers to same account.
 * To achieve decorator pattern you need following:
 * Create Interface - Base product
 * Create abstract class - Base product's base impl
 * Abstract Decorator - which implements base product - This works as foundation of decorator what other decorator needs to do minimum.
 * Different decorators - Which takes this product input and decorate it.
 *
 * Java example : Collection.unmodifiableMap - this is decorator which is extending Map's functionality and
 * making unmodifiable.
 * https://cecs.wright.edu/~tkprasad/courses/ceg860/paper/node26.html
 *
 * More details  : https://www.javadevjournal.com/java-design-patterns/decorator-design-pattern/
 */
public class Main {


    public static void main(String[] args){
        Coffee coffee=new Mocha(new Milk(new Espresso()));
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

        Coffee latte=new WhippedCream(new Caramel(new Sugar(new Latte())));
        System.out.println(latte.getDescription());
        System.out.println(latte.getCost());
    }
}
