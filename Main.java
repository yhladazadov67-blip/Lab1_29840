import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // 1. Массив z типа long
        long[] z = new long[19];
        for (int i = 0; i < z.length; i++) {
            z[i] = i + 2;
        }

        // 2. Массив x типа double
        double[] x = new double[10];
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = -5.0 + random.nextDouble() * 19.0;
        }

        // 3. Двумерный массив b
        double[][] b = new double[19][10];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = calculateElement(z[i], x[j]);
            }
        }

        // 4. Вывод результата
        printMatrix(b);
    }

    // Метод вычисления элемента массива
    public static double calculateElement(long z, double x) {

        if (z == 3) {
            return Math.sin(Math.asin(Math.pow((x + 4.5) / 19.0, 2)));
        }

        if (z == 5 || z == 8 || z == 10 || z == 12 || z == 15 ||
                z == 16 || z == 18 || z == 19 || z == 20) {

            return Math.pow(
                    0.5 / (0.75 + Math.cbrt(Math.pow(x + 1, 3))),
                    2
            );
        }

        return Math.tan(
                Math.cos(
                        Math.pow(x, (0.25 - x)) / (Math.log(Math.abs(x)) - 2)
                )
        );
    }

    // Метод вывода матрицы
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%10.5f ", value);
            }
            System.out.println();
        }
    }
}