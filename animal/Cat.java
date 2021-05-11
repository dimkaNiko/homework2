package ru.geekbrains.lesson6.animal;

public class Cat extends Animal {
    public static int getCountCat(){
        return countCat;
    };

    private static int countCat = 0;

    public Cat(String animalType, String name) {
        super(animalType, name);
        countCat++;
    }

    @Override
    public void run(int distance) {
        if (distance < 200 && distance > 0){ // можно конечно прописать условие о том что если число меньше нуля то..
            super.run(distance); // типа это шутка что ли? решил оставить в таком виде)
        } else {
            System.out.println("This Cat can't handle it");
        }
    }

    @Override
    public void swim(int swimDistance){
        System.out.println("Cats won't get into this wet puddle!!!");
    }
}
