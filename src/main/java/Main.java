package main.java;

public class Main {

    public static void main(String[] args) {
        short a[] = {6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
        float x[] = new float[14];
        for (int i = 0; i < 14; i += 1) x[i] = (float) Math.random() * 13 - 11;
        double a1[][] = new double[10][14];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                if (a[i] == 12) a1[i][j] = Math.pow(Math.pow(Math.E, Math.asin((x[j] - 4.5) / 13)), 1 / 3);
                else if (a[i] == 10 || a[i] == 14 || a[i] == 16 || a[i] == 20 || a[i] == 22)
                    a1[i][j] = Math.log(Math.pow(5 * (Math.PI + Math.pow(Math.tan(x[j]), 2)), Math.asin(Math.pow(Math.E, -Math.abs(x[j])))));
                else a1[i][j] = Math.atan(0.1 * Math.cos(x[j]));
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++)
                System.out.printf("%10.5f ", a1[i][j]);
            System.out.println();
        }
    }
}