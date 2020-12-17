package ua.mainacadamy.Models;
//Формула на сторону с высотой, с наследством от квадрата
public class Triangle extends Square{

    //Знакомая сторона треугольника 1
    private double sideB;
    public double getSideB() {
    return sideB; }
    public void setSideB(double sideB) {
    this.sideB = sideB; }

    //Площадь
    public double getArea() {
    return getSideA() * sideB / 2;
    }
}
