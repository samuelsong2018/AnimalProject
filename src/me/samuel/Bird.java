package me.samuel;

//We can extend a class into a more specific type
//By using the keyword 'extends'.
public class Bird extends Animal {

    //We can add methods specific to our Bird class
    public String fly() {
        return "The bird is flying.";
    }

    //We can use content in this class to override methods from the parent class
    @Override
    public String sleep(){
        return "The bird is sleeping.";
    }
}
