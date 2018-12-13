package de.unistuttgart.iste.rss.pse.exercise10.override;

public class Hamster extends Animal {

    private static final String HAMSTER_LITERAL_NLS = "Hamster";

    public Hamster(final String name) {
        super(name);
    }

    @Override
    protected String getAnimalType() {
        return HAMSTER_LITERAL_NLS;
    }

}
