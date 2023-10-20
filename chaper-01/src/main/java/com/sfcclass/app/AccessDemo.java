package com.sfcclass.app;

public class AccessDemo {
    public static void main(String[] args) {
        AccessDemoMyClass ob = new AccessDemoMyClass();
        ob.setAlpha(-99);
        System.out.println("null ob.alpha: " + ob.getAlpha());

        ob.beta = 88;
        ob.gamma = 99;
    }
}
