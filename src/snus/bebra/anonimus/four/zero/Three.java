package snus.bebra.anonimus.four.zero;

public class Three {
    public static void main(String[] args) {
        for (Seasons s: Seasons.values())
            System.out.printf("%s: Средняя температура - %.1f%n", s.getName(), s.getTemperature());
    }
}
