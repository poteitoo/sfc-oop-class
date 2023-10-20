package com.sfcclass.app;

public class AverageOfTenDoubles {
    public static void main(String[] args) {
        double[] x = { 1.0, 2.0, 3.0, 4.0, 5.0,
                6.0, 7.0, 8.0, 9.0, 10.0 };

        // calculate sum of x
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        System.out.println(sum / 10.0);
    }
}
