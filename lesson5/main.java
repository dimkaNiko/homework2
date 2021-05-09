package ru.geekbrains.lesson5;

public class main {

    private String name;
    private String position;
    private String email;
    private String cellNumber;
    private int salary;
    private int age;

    public static void main(String[] args) {
        Employer employer1 = new Employer();
        employer1.name = "Ivanov Ivan";
        employer1.position = "Developer";
        employer1.email = "1234@yahoo.com";
        employer1.cellNumber = "89129121212";
        employer1.salary = 80000;
        employer1.age = 36;

        employer1.presentation();

        System.out.println();

        Employer[] empCorp = new Employer[5];
        empCorp[0] = new Employer("Ivanov Ivan", "Developer", "1234@yahoo.com", "89129121212",80000,36);
        empCorp[1] = new Employer("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314",50000,32);
        empCorp[2] = new Employer("Sidorov Sidr", "Water pot", "sidorov@mailbox.com", "892312315",10000,43);
        empCorp[3] = new Employer("Pupkina Nadegda", "EnvelopeLicker", "pupkina@mailbox.com", "892312316",5000,18);
        empCorp[4] = new Employer("Juk J", "GrinderPencil", "juk@mailbox.com", "892312317",3000,51);
        for (Employer employer : empCorp)
            if (employer.getAge()>40)
                System.out.println(employer);


    }
}
