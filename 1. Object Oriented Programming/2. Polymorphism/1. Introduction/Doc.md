# Polymorphism 

Methods with the same name performing different tasks for different objects is the concept of polymorphism.
Polymorphism enables flexibility in Java.

## Polymorphism types

- Compile time polymorphism 
- Runtime polymorphism 

### Compile time polymorphism 

In this type compiler can resolve which method to be called at compile time(early binding).
It is achieved through method overloading.
Method overloading - Same class having methods with the same name but with different Parameters.

### Runtime polymorphism 

In this type compiler can't resolve which method to be called at compile time it is decided at the runtime(late binding).
It is achieved through method overridng.
Method overriding - A subclass overrides a method with the same signature as that of in its superclass.

### Sample Code Explanation

#### MethodOverloadSample

In the sample code Calc class have two methods with same name “ add ” but with different parameters.

If we call add method with two parameters ( for ex :- add( 5 , 6 ) ) the following method will be called.

```Java

int add(int a , int b ) {
	return a+b;
}

```

If we call add method with three parameters ( for ex :- add( 5 , 6 , 7) ) the following method will be called.

```Java

int add(int a , int b , int c ) {
	return a+b;
}

```

This is how method overloading works, methods with same name working on different tasks considering the parameters provided, achieving compile time polymorphism.

#### MethodOverrideSample

In the sample code makeSound() method of super class Animal has been overridden in the sub classes Cow and Cat.

```Java

class Animal{
	void makeSound() {
		
	}
}

```

If we call makeSound() method from a Cow type reference JVM will call makeSound() method of the Cow class printing “moow”.

```Java

class Cow extends Animal{
	@Override
	void makeSound() {
		System.out.println("moow");
	}
}

```

If we call makeSound() method from a Cat type reference JVM will call makeSound() method of the Cat class printing “meow”.

```Java

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("meow");
	}
}

```

Here the method makeSound functions in different ways according to the reference type making the code run-time polymorphic.
