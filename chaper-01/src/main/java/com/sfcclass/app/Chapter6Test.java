package com.sfcclass.app;

public class Chapter6Test {
    int a, b;

    Chapter6Test(int i, int j) {
        a = i;
        b = j;
    }

    void change(Chapter6Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
