Architecture
------------

[Existing Architecture](existingArchitectureDiagram.drawio)

New requirement to update application every 6 months to survive in market have unique product.

In current Implementation we have Duck Super class and different behavior ducks extends the ducks.Duck class.
when we add new feature (say fly method) to super class then all ducks override this method. It doesn't make sense.

So, Inheritance is not the answer, as they want to upgrade product every six months. CHANGE IS CONSTANT.

We have Design Principles.

* Identify the aspects of your application that vary and separate them from what stays the same.
    " Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without
    affecting those that don't. "
* Program to an interface, not an implementation. (class declaring them doesn't need to know about the actual object)

* Favor composition over inheritance.
  creating systems using composition gives you a lot more flexibility. Not only does it let you encapsulate a family 
  of algorithms into their own set of classes, but it also lets you change behavior at runtime as long as the object you're composing with implements the correct behaviour interface.

[New Architecture](./architectureDiagram.drawio)

Strategy Pattern.
-----------------

Defines a family of algorithms, encapsulates each one, and make them interchangeable. Strategy lets the algorithm vary 
independently of clients that use it.

