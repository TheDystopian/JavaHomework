package snus.bebra.anonimus.four.one.two;

public class Phone {
    private long number;
    private String model;
    private double weight;


    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone(long number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public static String receiveCall (String name, long number) {
        return String.format("Звонит %s. Номер %d", name, number);
    }

    public static String receiveCall (String name) {
        return String.format("Звонит %s", name);
    }

    public long getNumber() {
        return number;
    }

    public String sendMessage(Long ...phones) {
        StringBuilder phns = new StringBuilder();

        for (Object p : phones)
            phns.append(String.format("%s%n", p));

        phns.append("****************");
        return phns.toString();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
