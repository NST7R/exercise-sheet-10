package de.unistuttgart.iste.rss.pse.exercise10.override;

public class OverloadedUsageTest {

    public static void main(final String[] args) {
        final Hamster paule = new Hamster("Paule");
        final Dog willi = new Dog("Willi");
        
        printAnimalInfo(paule);
        printAnimalInfo(willi);
        
        Animal animal = paule;
        printAnimalInfo(animal);
        
        animal = willi;
        printAnimalInfo(animal);
    }
    
    private static void printAnimalInfo(final Animal animal) {
        System.out.format("My type is Animal\n");
        System.out.format("My name is %s\n", animal.getAnimalName());        
    }

    private static void printAnimalInfo(final Hamster aHamster) {
        System.out.format("My type is Hamster\n");
        System.out.format("My name is %s\n", aHamster.getAnimalName());        
    }

    private static void printAnimalInfo(final Dog aDog) {
        System.out.format("My type is Dog\n");
        System.out.format("My name is %s\n", aDog.getAnimalName());        
    }
}
