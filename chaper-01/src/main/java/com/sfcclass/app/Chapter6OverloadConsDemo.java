package com.sfcclass.app;

public class Chapter6OverloadConsDemo {
    public static void main(String[] args) {
        Chapter6OverloadMyClass t1 = new Chapter6OverloadMyClass();
        Chapter6OverloadMyClass t2 = new Chapter6OverloadMyClass(88);
        Chapter6OverloadMyClass t3 = new Chapter6OverloadMyClass(17.23);
        Chapter6OverloadMyClass t4 = new Chapter6OverloadMyClass(2, 4);
        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
