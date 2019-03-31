package com.code;

public class TestTriangle {
    public static void main(String[] args) {
        //Constructor with no parameter
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        //Constructor with three parameter
        triangle = new Triangle(3,9,5);
        System.out.println(triangle);
    }
}
