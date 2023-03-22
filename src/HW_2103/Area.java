package HW_2103;
public class Area implements Comparable<Area>{
    double area;

    public double getArea() {
        return area;
    }


    @Override
    public int compareTo(Area o) {
        return (int) (getArea()-o.getArea());
    }
}