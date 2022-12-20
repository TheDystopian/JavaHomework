package snus.bebra.anonimus.six.ten.computer;

import snus.bebra.anonimus.six.ten.computer.parts.*;

import java.util.Scanner;
import java.util.StringJoiner;


public class Computer {
    private Part cpu, memory, monitor;
    private ComputerNames name;

    public static class ComputerBuilder {
        Computer computer = new Computer();

        public String listNames() {
            StringJoiner join = new StringJoiner("\n");

            for (int i = 0; i < ComputerNames.values().length; i++) {
                join.add((i+1) + ". " + ComputerNames.values()[i].getName());
            }
            return join.toString();
        }

        public int chooseComputerName() {
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Выберите имя компьютера\n" + this.listNames());
                if (!scanner.hasNextInt())
                    scanner.nextLine();
            } while (!scanner.hasNextInt());

            return (scanner.nextInt() - 1) % ComputerNames.values().length;
        }

        public ComputerBuilder setComputerName() {
            computer.setName(ComputerNames.values()[this.chooseComputerName()]);
            return this;
        }

        public ComputerBuilder generateComponents() {
            computer.setCpu(generatePart(new CPU()));
            computer.setMonitor(generatePart(new Monitor()));
            computer.setMemory(generatePart(new Memory()));
            return this;
        }
        public Part generatePart(Part part) {
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println(part.getType().getName() + " - Введите название \n");
                if (!scanner.hasNextInt())
                    scanner.nextLine();
            } while (!scanner.hasNextLine());

            part.setName(scanner.nextLine());

            return part;
        }

        public Computer build() {
            return computer;
        }
    }

    public static ComputerBuilder getBuilder() {
        return new ComputerBuilder();
    }

    public void setMonitor(Part monitor) {
        this.monitor = monitor;
    }

    public void setMemory(Part memory) {
        this.memory = memory;
    }

    public void setCpu(Part cpu) {
        this.cpu = cpu;
    }

    public Part getMemory() {
        return memory;
    }

    public Part getMonitor() {
        return monitor;
    }

    public Part getCpu() {
        return cpu;
    }

    public void setName(ComputerNames name) {
        this.name = name;
    }

    public ComputerNames getName() {
        return name;
    }

    @Override
    public String toString() {
        StringJoiner join = new StringJoiner("\n • ");
        return join.add(name.getName()).add(cpu.getName()).add(memory.getName()).add(monitor.getName()).toString();
    }
}
