package com.sfcclass.app;

public class LowerToUpper {
    public static void main(String[] args)
            throws java.io.IOException {
        System.out.println("Enter characters. End with a period.");

        int changes = 0;
        char inputChar;

        while ((inputChar = (char) System.in.read()) != '.') {
            if (Character.isLowerCase(inputChar)) {
                System.out.print((char) (inputChar - 32));
                changes++;
            } else {
                System.out.print(inputChar);
            }
        }

        System.out.println("\nNumber of case changes: " + changes);
    }
}
