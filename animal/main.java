package ru.geekbrains.lesson6.animal;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bloodhound", "Bobik");
        Dog dog1 = new Dog("Doberman", "Rex");
        Dog dog2 = new Dog("Shepherd", "Tuzik");
        dog.run(-600);
        dog1.run(490);
        dog2.run(150);
        dog.swim(5);
        dog1.swim(9);
        dog2.swim(12);
        System.out.println("\nКоличество животных " + Animal.getNumberOfCreatedAnimals());
        System.out.println("Количество собак " + Dog.getCountDog());
        System.out.println();
        Cat cat = new Cat ("Siamse", "Hyusha");
        Cat cat1 = new Cat("Reed","Lyutik");
        Cat cat2 = new Cat("Persian", "PatryShah");
        cat.run(300);
        cat1.run(190);
        cat2.run(10);
        cat.swim(5);
        System.out.printf("\nКоличество кошек " + Cat.getCountCat());
        System.out.println("\nКоличество животных " + Animal.getNumberOfCreatedAnimals());
    }
}
