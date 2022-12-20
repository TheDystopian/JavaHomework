package snus.bebra.anonimus.six.ten.ne.parts;

public enum PartType {
    CPU ("Процессор"),
    MEMORY ("Память"),
    MONITOR ("Монитор");

    private String name;

    PartType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
