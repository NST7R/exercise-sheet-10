package de.unistuttgart.iste.rss.pse.exercise10.override;

public class Dog extends Animal {

    private static final String DOG_LITERAL_NLS = "Dog";

    public Dog(final String name) {
        super(name);
    }

    @Override
    protected String getAnimalType() {
        return DOG_LITERAL_NLS;
    }

}
