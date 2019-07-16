package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle myTriangle = new Triangle(3.0,4.0,5.0);
        System.out.println(myTriangle.isValid());
        Double perimetr=myTriangle.getPerimetr();
    System.out.println(perimetr);
    System.out.println(myTriangle.getArea());
    }
}
