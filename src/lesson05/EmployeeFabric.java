package lesson05;

public class EmployeeFabric {

    public static void main(String[] args) {
        System.out.println("Program Start");
        System.out.println();

        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Ivan Petrov", "Actor", "ivan_petrov@gmail.com", "89261234455", 8500, 48);
        System.out.println("---");
        employeesArray[1] = new Employee("Petr Ivanov", "Engineer","p.iva@gmail.com", "89211234566", 10000, 33);
        System.out.println("---");
        employeesArray[2] = new Employee("Jerry Rid", "Famous Actor", "j_rid@gmail.com", "89210008865", 4500, 31);
        System.out.println("---");
        employeesArray[3] = new Employee("Rain Sid", "Waiter","r.sid@gmail.com", "89215557788", 10080, 23);
        System.out.println("---");
        employeesArray[4] = new Employee("Camel More", "CEO", "camel_more@gmail.com", "89269998877", 18500, 21);

        System.out.println();
        System.out.println("Senior is: ");

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].age > 40) {
                employeesArray[i].showInfo();
            }
        }
        System.out.println("Program End");
    }
}
