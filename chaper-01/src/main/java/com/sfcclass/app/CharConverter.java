package com.sfcclass.app;

public class CharConverter {
    private char lastConversion;
    private int numberOfConversions = 0;

    // Convert lowercase to uppercase and vice versa
    public char convert(char c) {
        if (Character.isLowerCase(c)) {
            lastConversion = Character.toUpperCase(c);
            numberOfConversions++;
            return lastConversion;
        } else {
            lastConversion = c;
            return c;
        }
    }

    public char getLastConversion() {
        return lastConversion;
    }

    public int getNumberOfConversion() {
        return numberOfConversions;
    }

    public static void main(String[] args) {
        CharConverter converter = new CharConverter();

        char testChar1 = 'a';
        char testChar2 = 'Z';
        char testChar3 = '1';

        System.out.println("Original: " + testChar1 + " -> Converted: " + converter.convert(testChar1));
        System.out.println("Original: " + testChar2 + " -> Converted: " + converter.convert(testChar2));
        System.out.println("Original: " + testChar3 + " -> Converted: " + converter.convert(testChar3));

        System.out.println("Last conversion result: " + converter.getLastConversion());
        System.out.println("Total number of conversions: " + converter.getNumberOfConversion());
    }
}
