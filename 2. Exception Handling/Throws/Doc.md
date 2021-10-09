# Throws - Exception handling

- The Java throws keyword is used to declare an exception.
- It indicates that an exception may occur when the method is being excecuted.
- The exception is passed to the method which called the risky method and the exception should be handled there with try-catch-finally block or should be thrown.

## Java Throws Syntax

```Java

type method (arguments) throws Exception{
	//Risky Code
}

```

## Sample Code Explanation

The "foo" method in the sample code throws an exception and declares it using the throws keyword to its caller.
```Java

static void foo() throws Exception{
	System.out.println(3/0);
}

```

The "main" method who calls the foo method, handles the exception within a try-catch block and prints the exception stack trace.
```Java
public static void main(String[] args) {
	try{
		foo();
	}catch(Exception e){
		e.printStackTrace();
	}
}
```
