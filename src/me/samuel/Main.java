package me.samuel;

public class Main {

    public static void main(String[] args) {
	String name = "Bart";
        System.out.println(name.toUpperCase());

        Animal dog = new Animal();
        dog.setAnimalName("Fido");
        System.out.println(dog.getAnimalName());
        System.out.println(dog.eat());
        System.out.println(dog.sleep());

        Animal cat = new Animal();
        cat.setAnimalName("Mittens");
        System.out.println(cat.getAnimalName());
        System.out.println(cat.eat());
        System.out.println(cat.sleep());
        System.out.println(cat.myThoughts());

//        Animal bird = new Animal();
//        bird.setAnimalName("Hedwig");
//        System.out.println(bird.getAnimalName());
//        System.out.println(bird.eat());
//        System.out.println(bird.sleep());

        Animal dragon = new Animal();
        dragon.setAnimalName("Puff");
        System.out.println(dragon.getAnimalName());
        System.out.println(dragon.eat());
        System.out.println(dragon.sleep());

        Bird bird = new Bird();
        bird.setAnimalName("Tweety");
        System.out.println(bird.getAnimalName());
        System.out.println(bird.sleep());
    }
}
