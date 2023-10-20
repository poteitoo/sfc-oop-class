package com.sfcclass.app;

class Chapter6PassObRef {
    public static void main(String[] args) {
        Chapter6Test ob = new Chapter6Test(15, 20);
        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);
    }
}
