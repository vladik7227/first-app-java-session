package ua.mainacadamy.Models;
//Формула добутка всех сторон на 4*радиус , наследство от круга.
public class TriangleTwo extends Circle {

    public double fourradius = 4 * getRadius();

    //Приват на знакомую сторону треугольника
    private double SideC;
    public double getSideC() {
    return SideC; }
    public void setSideC(double sideC) {
    SideC = sideC; }

    //Вторая сторона треугольника
    private double SideD;
    public double getSideD() {
    return SideD; }
    public void setSideD(double sideD) {
    SideD = sideD; }


    //Третяя сторона треугольника
    private double SideF;
    public double getSideF() {
    return SideF; }
    public void setSideF(double sideF) {
    SideF = sideF; }

    public double getArea() {
    return getSideF() * getSideC() * getSideD() / fourradius;
    }
}



