package snus.bebra.anonimus.three.SubClass3.EmployeeReport;

import java.util.Random;

public class ReportTest {
    public static <T> T randomElement (T[] array) {
        Random random = new Random();

        return array[random.nextInt(0, array.length)];
    }



    public static void main(String[] args) {
        final String[] names = {"Draedon", "Saul Goodman", "Walter White", "Gordon Freeman", "Isaac", "Adam Smasher", "V", "Dr. Coomer"};
        final Double[] salary = {666.66, 999.99, 1999.99, 3999.99, 9999.99, 30999.99, 49999.99};

        Report report = new Report();


        for (int i = 0; i < 5; i++)
            report.newEmployee(
                    randomElement(names),
                    randomElement(salary).doubleValue()
            );

        System.out.println(report.generateReport());




    }
}
