package ua.mainacadamy;

import ua.mainacadamy.Models.Circle;
import ua.mainacadamy.Models.Triangle;
import ua.mainacadamy.Models.TriangleTwo;

public class HomeWorkApplication {

    public static void main(String[] args) {
        Circle Circle = new Circle();
        Circle.setRadius(20);
        System.out.println("The Circle with radius "+Circle.getRadius()+" is "+Circle.getArea());

        Triangle trianglee = new Triangle();
        trianglee.setSideA(40);
        trianglee.setSideB(30);
        System.out.println("Triangle area with side "+trianglee.getSideA()+" and hight "+trianglee.getSideB()+" is "+trianglee.getArea());

        TriangleTwo trianglet = new TriangleTwo();
        trianglet.setSideC(70);
        trianglet.setSideD(90);
        trianglet.setSideF(50);
        System.out.println("Triangle Two area with sides "+trianglet.getSideF()+" "+trianglet.getSideD()+" "+trianglet.getSideC()+" and radius "+ Circle.getRadius()+" is "+trianglet.getArea());
}
}