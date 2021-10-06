# Encapsulation

Encapsulation can define as the process of connecting and binding together the data and objects and keeps them safe from outside interference and misuse.
This can be implemented or achieved by making the fields of the class Private and providing access to those fields using public methods.

## Types of Access Modifiers

There are few Access Modifiers which help in encapsulation
- Private
- No Modifier
- Protected
- Public


# Advantages on Encapsulation

- The encapsulated code is more flexible and easy to change with new requirements.
- It prevents the other classes to access the private fields.
- Encapsulation allows modifying implemented code without breaking other code that has implemented the code.
- It keeps the data and codes safe from external inheritance. Thus, Encapsulation helps to achieve security.

# Code snippet explaination

``` java

   //using private access modifiers

    private  String Breed;
    private String Color;
    private int Age;
    private int Size;
    
```

In the above mentioned code snippet, we can see that all the attributes of the class are made private, hence these attributes cannot be accessed directly outside of the class. To access them these getters and setter methods are used.In the below mentioned code you will be able to see how it is done.

``` java

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
    
```

As shown above the setter methods initialize or change the value of an attribute and getters return the value of an attribute.
