# Factory Design Pattern

* This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
* In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
* Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.


### Pros 
* You avoid tight coupling between the creator and the concrete products.
* Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
* Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.

### Cons 
* The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. 
  The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.
