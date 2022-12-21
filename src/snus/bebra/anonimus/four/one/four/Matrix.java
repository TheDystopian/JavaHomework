package snus.bebra.anonimus.four.one.four;

public class Matrix {
    private static final double[][] matrix = new double[][] {
            {69.420, 13.37, 2.28},
            {77.7, 55.55, 666.666},
            {200.7, 20.77, 3000.00}
    };
    private static final int sizeY = matrix.length;
    private static final int  sizeX = matrix[0].length;

    public double[][] getMatrix() {
        return matrix;
    }

    public void sum(double[][] matrix){
        for (int i = 0; i < Math.min(sizeY, matrix.length); i++)
            for (int j = 0; j < Math.min(sizeX, matrix[i].length); j++)
                this.matrix[i][j] += matrix[i][j];
    }

    public void mul(double[][] matrix){
        for (int i = 0; i < Math.min(sizeY, matrix.length); i++)
            for (int j = 0; j < Math.min(sizeX, matrix[i].length); j++)
                this.matrix[i][j] *= matrix[i][j];
    }

    public void mul(double matrix){
        for (int i = 0; i < sizeY; i++)
            for (int j = 0; j < sizeX; j++)
                this.matrix[i][j] *= matrix;
    }

    @Override
    public String toString() {
        StringBuilder mat = new StringBuilder();

        for (double[] y: matrix) {
            for (double x : y)
                mat.append(String.format("%f ",x));
            mat.append("\n");
        }

        return mat.toString();
    }
}
