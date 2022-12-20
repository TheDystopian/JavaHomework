package snus.bebra.anonimus.four.zero;

public enum Seasons {
    WINTER("Зима", "Холодное", -10),
    SPRING("Весна", "Теплое", 10),
    SUMMER("Лето", "Жаркое", 10),
    AUTUMN("Осень", "Теплое", 30);

    private final String name;
    private final String description;

    private final double temperature;

    private Seasons (String name, String description, double temperature) {
        this.name = name;
        this.description = description;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
