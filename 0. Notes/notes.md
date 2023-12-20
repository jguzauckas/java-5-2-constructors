# Constructors

Being the way that you create an object, **constructors** are going to be the first way we interact with classes, and so will be the first component we really delve into.

---

## Object States

The **state** of an object is based on its attributes and the values assigned to its attributes. Attributes refer to things like our instance variables and their values.

This introduces the concept of a **has-a** relationship between an object and its instance variables. If we look at a `Person` class with the instance variables `name` and `age`, then this is the idea that a `Person` object, or just a person, has a name and an age, which makes a lot of sense in traditional English!

---

## Constructor Purposes

A constructor sets the initial state of an object, and should include initial values for all instance variables. Here is a sample `Person` class with just instance variables and constructors from the `Person.java` file:

```java
public class Person {
    private String name;
    private int age;
    private double heightInches;

    public Person() {
        name = "";
        age = -1;
        heightInches = -1.0;
    }

    public Person(String n, int a, double h) {
        name = n;
        age = a;
        heightInches = h;
    }
}
```

As discussed in Unit 5 Section 1, there can be more than one constructor for a class to offer different ways to set the initial state for an object. The first constructor with no parameters is referred to as the **default constructor**, while any constructors with parameters are referred to as **non-default constructors**.

---

## How Constructors Work

It can be important to understand some of the inner workings of constructors to use them most effectively. First is how the parameters in a constructor function.

The parameters in a constructor (i.e., `n`, `a`, and `h` from above) are **local variables** to the constructor, which means they only exist within the constructor, and cease existing once the constructor finishes. They are used to assign values passed in by the user to the instance variables for the object.

These parameters follow a principle called **pass by value** in Java. What this means is, when I make an object calling the constructor with parameters, the values for those parameters are copied into the parameter variables `n`, `a`, and `h` instead of using the actual objects that could have been passed in. This actually creates a variety of behaviors depending on what we are passing in as parameters. For immutable objects like `String` objects or primitive types like our `int` `a` and `double` `h`, any information from the constructor call is actually copied to those variables, leaving the originals otherwise untouched. For the immutable objects like `String` objects, the reference is copied to the parameter variable `n`, but any changes through the variable `n` to the object would create a new `String` at a new memory location that the original is completely unaware of.

---

## No Constructor

You can create a class that has no constructor and Java will fill one in for you. The constructor Java fills in is never written in the class but will function as a **no-argument constructor**, filling the role of the **default constructor** we discussed earlier. It will take in no information, and will automatically assign default values to all instance variables in the class.

Default values are predefined base values for any given type. For example, these are the default values for the following types:
- `int` --> `0`
- `double` --> `0.0`
- `boolean` --> `false`
- `String` --> `null`

These are different default values than our default constructor from above with good purpose. The values we assign in a default constructor have meaning to us. When we see an `age` of `-1`, that means to us that an `age` wasn't provided. Seeing an `age` of `0` like would happen with the no-argument constructor doesn't necessarily mean we didn't get an `age`, because babies would be `0` years old.

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
