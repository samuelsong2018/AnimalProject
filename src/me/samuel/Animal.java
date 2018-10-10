package me.samuel;

public class Animal {
    private String animalName;

    //a constructor is a method that has the same name of the class
    //it will run whenever the class is instantiated (whenever you use the keyword: new)
    public Animal(){
        System.out.println("This is the constructor.");
    }

    //an overloaded constructor contains a different method signature
    public Animal(String value){
        //the keyword this refers to the current class
        this.animalName = value;
        animalName = value;
    }

    //public methods are visible to hte calling class (ie: Main)
    public String sleep(){
        return "An animal sleeps...";
    }

    public String eat(){
        return "An animal eats...";
    }

    public String getAnimalName(){
        return animalName;
    }
    public void setAnimalName(String value){
        if (value.equalsIgnoreCase("cat"))
            this.animalName = "Mittens";
        this.animalName = value.toUpperCase();
    }

    //private method is not available outside this class.
    private String thoughts(){
        return "I'm hungry.";
    }

    //A public method can access the private method, but they have to both be in the same class.
    public String myThoughts(){
        String output=thoughts();
        return output;
    }
}
