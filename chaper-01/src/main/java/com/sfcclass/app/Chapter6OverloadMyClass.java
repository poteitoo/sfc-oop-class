package com.sfcclass.app;

public class Chapter6OverloadMyClass {
    int x;

    Chapter6OverloadMyClass() {
        System.out.println("Inside Chapter6OverloadMyClass().");
        x = 0;
    }

    Chapter6OverloadMyClass(int i) {
        System.out.println("Inside Chapter6OverloadMyClass(int).");
        x = i;
    }

    Chapter6OverloadMyClass(double d) {
        System.out.println("Inside Chapter6OverloadMyClass(double).");
        x = (int) d;
    }

    Chapter6OverloadMyClass(int i, int j) {
        System.out.println("Inside Chapter6OverloadMyClass(int, int).");
    }
}