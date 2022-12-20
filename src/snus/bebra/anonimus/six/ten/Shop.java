package snus.bebra.anonimus.six.ten;

import snus.bebra.anonimus.six.ten.computer.Computer;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Shop {
    private final ArrayList<Computer> computers = new ArrayList<>();

    public void newComputer(){
        computers.add(
            Computer.getBuilder().setComputerName().generateComponents().build()
        );
    }

    public String listComputers() {
        StringJoiner join = new StringJoiner("\n");

        for (int i = 0; i < computers.size(); i++) {
            join.add((i+1) + ". " + computers.get(i).toString());
        }

        return join.toString();
    }

    public void deleteComputer(int index) {
        if (index < 1 || index > computers.size())
            return;

        computers.remove(index-1);
    }






}
