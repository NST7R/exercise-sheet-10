package de.unistuttgart.iste.rss.pse.exercise10.override;

public class OverrideUsageTest {

    public static void main(final String[] args) {
        final Animal paule = new Hamster("Paule");
        final Animal willi = new Dog("Willi");
        
        paule.printAnimalInfo();
        willi.printAnimalInfo();
    }
}
