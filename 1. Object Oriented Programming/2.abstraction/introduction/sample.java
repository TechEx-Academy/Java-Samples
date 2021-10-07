public class sample {
    public static void main(String[] args) {
        Dog dog=new Dog();//create  a  dog object
        dog.animalSound();


    }
}
//abstract class
abstract class Animal{
    // Abstract method (does not have a body)
    public abstract void animalSound();
}

// Subclass (inherit from Animal)
class Dog extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Dog says: bow bow");
    }
}
