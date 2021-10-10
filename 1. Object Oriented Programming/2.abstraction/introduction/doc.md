# Abstraction

An Abstraction is a process of exposing all the necessary details and hiding the rest. In Java, Data Abstraction is defined as the process of reducing the object to its essence so that only the necessary characteristics are exposed to the users.

### The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

##### Abstraction means only essentials details display to the user.
##### Abstraction reduce the complexity of the code.
##### Avoid code duplication and increase the re-usability.
##### Helps to increase security of an application or program as only important details are provided to the user.

##### *Consider a Animal .Every animal has a sound.But various animal has various sound because we can create a abstract Animal class and abstract animalSound method within it.Then we can extends it from concrete Dog class and implements the that animalSound method.
