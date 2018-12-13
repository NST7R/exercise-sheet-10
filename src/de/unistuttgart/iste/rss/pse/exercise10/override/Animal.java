package de.unistuttgart.iste.rss.pse.exercise10.override;

public abstract class Animal {

    private final String name;
    
    public Animal(final String name) {
        super();
        this.name = name;
    }
    
    public void printAnimalInfo() {
        System.out.format("My type is %s\n", getAnimalType());
        System.out.format("My name is %s\n", name);
    }

    protected abstract String getAnimalType();

    public String getAnimalName() {
        return name;
    }

}

