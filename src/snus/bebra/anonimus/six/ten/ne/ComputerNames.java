package snus.bebra.anonimus.six.ten.ne;

public enum ComputerNames {
    BEBRA_COMPUTING("Bebra computing"),
    SNUSOED_ANONUMUS("Snusoed Anonimus"),
    SAUL_GOODMAN_3D("3D Saul Goodman");
    ComputerNames(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
