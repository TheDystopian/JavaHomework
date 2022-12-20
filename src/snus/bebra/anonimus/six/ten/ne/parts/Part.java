package snus.bebra.anonimus.six.ten.ne.parts;

abstract public class Part {
    private String name = "Unknown";
    private PartType type = null;

    public String getName() {
        return name;
    }

    public PartType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setType(PartType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Part{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
