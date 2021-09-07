package com.company;

import java.util.Arrays;

public class Shape {
    private static String color;
    private Point[] form;

    public Shape(String color,Point[] form) {
        this.color= color;
        this.form = form;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Shape.color = color;
    }

    public Point[] getForm() {
        return form;
    }

    public void setForm(Point[] form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Shape{" +
                color+
                " form=" + Arrays.toString(form) +
                '}';
    }
}



