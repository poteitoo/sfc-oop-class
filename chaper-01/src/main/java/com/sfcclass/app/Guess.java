package com.sfcclass.app;

public class Guess {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'J';
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");
        ch = (char) System.in.read();
        if (ch == answer)
            System.out.println("** Right **");
    }
}
