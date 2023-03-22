package HW_2103;

public class Rectangle extends Area {

    int a;
    int b;
    int area;



    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;

    }  public double getArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle = " + getArea();
    }
}
