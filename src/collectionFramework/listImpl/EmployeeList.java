package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee akshay = new Employee(101,"akshay","pune",23000);
        Employee ganesh = new Employee(11,"ganesh","mumbai",2300);
        Employee sachin = new Employee(12,"sachin","swargate",13000);
        Employee swapnil = new Employee(3,"swapnil","warje",5600);
        Employee sagar = new Employee(123,"sagar","kharadi",123000);

        employeeList.add(akshay);
        employeeList.add(ganesh);
        employeeList.add(sachin);
        employeeList.add(swapnil);
        employeeList.add(sagar);

        //print the list
        System.out.println("Before sorting");
        for (Employee emp:employeeList) {
            System.out.println(emp);
        }
        Collections.sort(employeeList);

        System.out.println("After sorting");
        for (Employee emp:employeeList) {
            System.out.println(emp);
        }
    }
}
