package com.sfcclass.app;

public class InchiesToMetersTable {
    public static void main(String[] args) {
        for (double foot = 0; foot <= 12; foot++) {
            for (double inches = 1; inches <= 12; inches++) {
                double len = foot * 12 + inches;
                double meters = len / 39.37;
                System.out.println(len + "ft -> " +
                        meters + "m");
            }
            System.out.println();
        }
    }
}
