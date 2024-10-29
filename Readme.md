# Super KEYWORD-AnimalInheritance

This project demonstrates inheritance in Java and the use of the `super` keyword to access parent class properties. The `AnimalInheritance` project defines an `Animal` class and a `Dog` subclass to show how a subclass can override attributes and access the superclass's attributes.

## Project Structure

- **Animal Class**: Contains an attribute `color` set to "white".
- **Dog Class**: Inherits from `Animal` and has its own `color` attribute set to "black". The `printColor` method demonstrates how to access both the subclass and superclass `color` attributes using `super`.
- **Main Class**: Creates an instance of `Dog` and calls `printColor` to display the colors of both `Animal` and `Dog`.

## Code Overview

### Animal.java
```java
class Animal {
    String color = "white";
}
class Dog extends Animal {
    String color = "black";
    
    void printColor() {
        System.out.println("second color: " + color);       // Refers to Dog's color
        System.out.println("white color: " + super.color);  // Refers to Animal's color using super
    }
}
class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.printColor();
    }
}
