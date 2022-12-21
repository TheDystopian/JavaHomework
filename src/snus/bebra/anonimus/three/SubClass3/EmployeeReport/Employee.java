package snus.bebra.anonimus.three.SubClass3.EmployeeReport;

public class Employee {
    private final String fullname;
    private final Double salary;

    Employee (String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }


    public Double getSalary() {
        return salary;
    }

    public String getFullname() {
        return fullname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
