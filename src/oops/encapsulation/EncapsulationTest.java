package oops.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        /*employee.employeeId = -100;
        employee.employeeName = "%%%%%%%%%%%%";
        employee.employeeSalary = -670000;*/
        employee.setEmployeeId(100);
        employee.setEmployeeName("abc");
        employee.setEmployeeSalary(100000);

        System.out.println("Employee ID \t" + employee.getEmployeeId());
        System.out.println("Employee Name \t" + employee.getEmployeeName());
        System.out.println("Employee Salary \t" + employee.getEmployeeSalary());


    }
}
