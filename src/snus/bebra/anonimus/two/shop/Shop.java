package snus.bebra.anonimus.two.shop;

import java.util.*;

public class Shop {
    private List <String> computers = new ArrayList();

    public void addComputer(String computer) {
        computers.add(computer);
    }

    public String findComputer(String computer) {
        return computers.contains(computer) ? computer : "";
    }

    public void deleteComputer(String computer) {
        computers.remove(computer);
    }
}
