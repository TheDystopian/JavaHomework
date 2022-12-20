package snus.bebra.anonimus.six.ten.ne;

public class Test {
    public static void main(String[] args) {
        Computer computer = Computer.getBuilder().setComputerName().generateComponents().build();

        System.out.println(computer);


    }

}
