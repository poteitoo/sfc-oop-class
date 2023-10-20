package com.sfcclass.app;

public class StringSorterChapter5Test4 {
    public static void main(String[] args) {
        char[] chars = { '1', 'f', '2', 'a', 'b' };
        int size = chars.length;

        // display original array
        System.out.print("Original array is:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + chars[i]);
        System.out.println();

        // This is the Bubble sort.
        for (int a = 1; a < size; a++)
            for (int b = size - 1; b >= a; b--) {
                if (chars[b - 1] > chars[b]) { // if out of order
                    // exchange elements
                    char t = chars[b - 1];
                    chars[b - 1] = chars[b];
                    chars[b] = t;
                }
            }

        // display sorted array
        System.out.print("Sorted array is:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + chars[i]);
        System.out.println();
    }
}
