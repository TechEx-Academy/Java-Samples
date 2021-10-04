public class Dog {

   //using private access modifiers
	
    private  String Breed;
    private String Color;
    private int Age;
    private int Size;
	
   //implementing setters and getters  public methods to access the private attributes

    public String getBreed() { //getter to get breed
        return Breed;
    }

    public void setBreed(String breed) { //setter to set breed
        Breed = breed;
    }

    public String getColor() { //getter to get color
        return Color;
    }

    public void setColor(String color) { //setter to set color
        Color = color;
    }

    public int getAge() { //getter to get age
        return Age;
    }

    public void setAge(int age) { //setter to set age
        Age = age;
    }

    public int getSize() { //getter to get size
        return Size;
    }

    public void setSize(int size) { //setter to set size
        Size = size;
    }
