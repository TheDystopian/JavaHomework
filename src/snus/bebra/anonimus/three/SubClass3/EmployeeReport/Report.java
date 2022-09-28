package snus.bebra.anonimus.three.SubClass3.EmployeeReport;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private final List <Employee> employeeList = new ArrayList<>();

    public void newEmployee(String name, double salary) {
        employeeList.add(
                new Employee(
                        name,
                        salary
                )
        );
    }

    public String generateReport() {
     StringBuilder report = new StringBuilder();

     report.append(String.format("%-20s%20s%n", "Name", "Salary"));

     for (Employee e: employeeList)
         report.append(
                 String.format(
                         "%-20s%20.2f%n",
                         e.getFullname(),
                         e.getSalary().doubleValue()
                 )
         );
     return report.toString();
    }
}
