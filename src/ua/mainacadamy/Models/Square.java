package ua.mainacadamy.Models;
//Квадрат
public class Square extends AbstractClass {

    //Сторона квадрата
    private  double SideA;
    public double getSideA() {
    return SideA; }
    public void setSideA(double sideA) {
    SideA= sideA; }


    //площадь
    public double getArea(){
    return SideA * SideA; }
}
