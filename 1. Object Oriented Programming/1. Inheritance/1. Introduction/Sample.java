public class Sample{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.foo();
        dog.bar();
        
    }
}

class Animal{
    void foo(){
        System.out.println("I am an Animal");
    }
}

class Dog extends Animal{
    void bar(){
        System.out.println("I am a Dog");
    }
}
