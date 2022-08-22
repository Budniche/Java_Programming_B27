package Practice;

public class RectangleWorking {

    double base;
    double height;
    int x;
    int y;
    double perimeter;
    double area;


    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }


    public void calculatePerimeter() {
        perimeter = (base + height) * 2;
        System.out.println("caltulated perimeter-" + perimeter);
    }


    public void calculateArea() {
        area = base * height;
    }

}