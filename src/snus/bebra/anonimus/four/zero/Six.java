package snus.bebra.anonimus.four.zero;

public class Six {
    public static void main(String[] args) {
        for (Seasons s: Seasons.values())
            System.out.printf("%s: Средняя температура - %.1f. %s время года%n", s.getName(), s.getTemperature(), s.getDescription());
    }
}
