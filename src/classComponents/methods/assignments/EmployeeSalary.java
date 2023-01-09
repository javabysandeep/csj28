package classComponents.methods.assignments;

public class EmployeeSalary {
    int salary;
    int numberOfHoursWorked;

    void setEmployeeInformation(int sal, int hours) {
        salary = sal;
        numberOfHoursWorked = hours;
    }

    void addSalary(){
        if(salary < 500){
            salary = salary + 10;
        }
    }

    void addWork(){
        if(numberOfHoursWorked > 6){
            salary = salary + 5;
        }
    }

    public static void main(String[] args) {
        EmployeeSalary emp = new EmployeeSalary();
        emp.setEmployeeInformation(1000,12);
        emp.addSalary();
        emp.addWork();
        System.out.println("Salary of an employee at the end of day "+emp.salary);
    }
}
