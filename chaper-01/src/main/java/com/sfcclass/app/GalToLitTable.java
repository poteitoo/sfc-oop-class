package com.sfcclass.app;

/*
Try This 1-2
This program displays a conversion
table of gallons to liters.
Call this program "GalToLitTable.java".
*/
class GalToLitTable {

    public static void main(String[] args) {
        int counter = 0;
        for (double gallons = 1; gallons <= 100; gallons++) {
            double liters;
            liters = gallons * 3.7854; // convert to liters
            System.out.println(gallons + " gallons is " +
                    liters + " liters.");
            counter++;
            // every 10th line, print a blank line
            if (counter == 10) {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }
}