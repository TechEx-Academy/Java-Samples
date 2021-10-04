public class MethodOverrideSample {
	public static void main(String[] args) {
        
    }
}

class Animal{
	void makeSound() {
		
	}
}

class Cow extends Animal{
	@Override
	void makeSound() {
		System.out.println("moow");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("meow");
	}
}