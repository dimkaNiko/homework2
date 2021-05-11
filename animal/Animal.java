package ru.geekbrains.lesson6.animal;

public class Animal {
    public static int getNumberOfCreatedAnimals() {
        return numberOfCreatedAnimals;
    }

    private static int numberOfCreatedAnimals = 0;

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public Animal(String animalType, String name) {
        Animal.numberOfCreatedAnimals++;
        this.animalType = animalType;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String animalType;
    private String name;

    public void run(int distance) {
        System.out.printf("%s %s ran about %d meters!\n", this.animalType, this.name, distance);
    }

    public void swim(int swimDistsance) {
        System.out.printf("%s %s swam about %d meters!\n", this.animalType, this.name, swimDistsance);
    }


}
