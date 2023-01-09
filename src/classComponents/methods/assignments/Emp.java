package classComponents.methods.assignments;

public class Emp {
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
        Emp employee1 = new Emp();
        Emp employee2 = new Emp();
        Emp employee3 = new Emp();

        //set the values for employee
        employee1.setEmployeeDetails("Sam", "Swargate", 34000, 2021);
        employee2.setEmployeeDetails("Robert", "Wakad", 56000, 2021);
        employee3.setEmployeeDetails("Sam", "Swargate", 34000, 2021);

        //print the employee details
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
        employee3.printEmployeeDetails();

    }
}
