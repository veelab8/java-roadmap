package abstraction;

public class Main {
    public static void main(String[] args) {
        // we can't create an instance of an abstract class
        // Animal animal = new Animal("animal", "big", 100);

        Dog dog = new Dog ("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
