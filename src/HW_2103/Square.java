package HW_2103;

public class Square extends Area{
    int a;
    double area;


    public Square(int a){
        this.a = a;

    }
    public double getArea(){
        return a*a;
    }
    @Override
    public String toString() {
        return "Square = " + getArea() ;
    }
}
