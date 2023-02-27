package collectionFramework.listImpl;

public class Employee implements Comparable<Employee>{
    int employeeId;
    String employeeName;
    String employeeAddress;
    int employeeSalary;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public Employee(int employeeId, String employeeName, String employeeAddress, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.employeeId-employee.employeeId;
    }
}
