package lesson05;

public class Employee {

    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

        showInfo();
    }

    void showInfo() {
        System.out.println("Name is: " + name);
        System.out.println("Position is: " + position);
        System.out.println("Salary is: " + salary);
        System.out.println("Age is: " + age);
        System.out.println("Phone number is: " + phoneNumber);
        System.out.println("Email is: " + email);

    }
}
