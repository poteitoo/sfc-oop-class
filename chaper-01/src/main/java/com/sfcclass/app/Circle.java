package com.sfcclass.app;

public class Circle extends TwoDShape {
    Circle() {
        super();
    }

    Circle(double x) {
        super(x, "circle");
    }

    double area() {
        return (getWidth() / 2) * (this.getWidth() / 2) * 3.1416;
    }
}
