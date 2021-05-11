package ru.geekbrains.lesson6.animal;

public class Dog extends Animal {
    public static int getCountDog(){
        return countDog;
    }

    private static int countDog = 0;

    public Dog(String animalType, String name) {
        super(animalType, name);
        Dog.countDog++;
    }

    @Override
    public void run(int distance) {
        if (distance < 500 && distance > 0) {
            super.run(distance);
        } else {
            System.out.println("This dog will not cover the distance!");
        }
    }

    @Override
    public void swim(int swimDistsance) {
        if (swimDistsance < 10 && swimDistsance > 0) {
            super.swim(swimDistsance);
        } else {
            System.out.printf("The dog can drown!!!\n");
        }
    }
}

