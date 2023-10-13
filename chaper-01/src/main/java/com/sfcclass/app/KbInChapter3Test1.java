package com.sfcclass.app;

public class KbInChapter3Test1 {
    public static void main(String[] args)
            throws java.io.IOException {
        int spaceCount = 0;
        char inputChar;

        while ((inputChar = (char) System.in.read()) != '.') {
            if (inputChar == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Total number of spaces: " + spaceCount);
    }
}
