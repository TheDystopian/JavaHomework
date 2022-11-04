package snus.bebra.anonimus.four.one.four;

public class MatTest {
    public static void main(String[] args) {
        Matrix m0 = new Matrix();
        Matrix m1 = new Matrix();

        System.out.println(m0);
        m0.sum(m1.getMatrix());
        System.out.println(m0);
        m0.mul(3);
        System.out.println(m0);
        m0.mul(m1.getMatrix());
        System.out.println(m0);

    }
}
