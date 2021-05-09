package ru.geekbrains.lesson5;

public class Employer {
    String name;
    String position;
    String email;
    String cellNumber;
    int salary;
    int age;

    public Employer(String name, String position, String email, String cellNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.cellNumber = cellNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employer() { // для выполнения первых 2х пунктов дз.
    }

    public void presentation() {
        System.out.printf(" %s устроен на должность %s.\n Личные данные:\n Эл. потча: %s\n Номер телефона: %s\n Зарплата: %d\n Возраст: %d", name, position, email, cellNumber, salary, age);
    }
        public int getAge() {
            return age;
        }

        public String toString(){
            return(name+ "\n-"
                    +position+ "\n-"
                    +email+ "\n-"
                    +cellNumber+ "\n-"
                    +salary+ "\n-"
                    +age);
        }

    }

