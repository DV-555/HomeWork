package HW_2103;

public class Circle extends Area{
    int radius;
    double area;

    public Circle(int radius){
        this.radius=radius;
    }
    public double getArea(){
        return   (radius*radius*3.14);
    }
    public String toString(){
        return "Circle = "+getArea();
    }
}
