package ua.mainacadamy.Models;
//Круг, радиус круга приват.
public class Circle extends AbstractClass {

    //Радиус приват
    private double radius;
    public double getRadius() {
    return radius; }
    public void setRadius(double radius) {
    this.radius = radius; }


    //Площадь
    public double getArea(){
    return radius * radius * Math.PI; }
}
