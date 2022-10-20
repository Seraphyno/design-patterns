Creational design patterns
---

### Singleton

###### Problem
We want to simulate the behavior of a real-wold singleton

For this let's use the example of a family using a refrigerator
Our goal here can be achieved mainly by checking the identifier - only one instance should be present

###### Solution
- Create a class describing an object, having a unique id generated
- Make it use the same instance
- Test, test, test



### Builder

###### Problem
We want to demonstrate how we can construct a complex object,
having different requirements from users - required and optional properties

###### Solution
- Create a class describing an object, having several required and optional properties
- Make use of the builder pattern (static nested builder class)
- Test, test, test
