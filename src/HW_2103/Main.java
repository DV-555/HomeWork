package HW_2103;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Area> shapes = new ArrayList<>();

        Area circle=new Circle(6);
        shapes.add(new Rectangle(3,5));
        shapes.add(new Circle(7));
        shapes.add(new Square(8));
        shapes.add(new Circle(3));
        shapes.add(new Square(9));

        System.out.println(shapes);//[Rectangle = 15.0, Circle = 153.86, Square = 64.0, Circle = 28.26, Square = 81.0]

        Collections.sort(shapes);
        System.out.println(shapes);//[Rectangle = 15.0, Circle = 28.26, Square = 64.0, Square = 81.0, Circle = 153.86]



    }




}