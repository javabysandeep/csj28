package classComponents.methods.assignments;

public class Employee {
    String name;
    String address;
    int yearOfJoining;
    int salary;

    void setEmployeeDetails(String n, String a, int y, int sal) {
        name = n;
        address = a;
        yearOfJoining = y;
        salary = sal;
    }

    void printEmployeeDetails() {
        System.out.println(name + "\t" + address + "\t" + yearOfJoining + "\t" + salary);
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.name = "Robert";
        employee1.address = "Warje";
        employee1.salary = 45000;
        employee1.yearOfJoining = 2020;

        employee2.name = "Sam";
        employee2.address = "Swargate";
        employee2.salary = 34000;
        employee2.yearOfJoining = 2021;

        employee3.name = "John";
        employee3.address = "Wakad";
        employee3.salary = 54000;
        employee3.yearOfJoining = 2023;

        employee1.setEmployeeDetails("Sam", "Swargate", 34000, 2021);
        employee2.setEmployeeDetails("Robert", "Wakad", 56000, 2021);
        employee3.setEmployeeDetails("Sam", "Swargate", 34000, 2021);

        //print the employee details
    employee1.printEmployeeDetails();
    employee2.printEmployeeDetails();
    employee3.printEmployeeDetails();

    }
}
