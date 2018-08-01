package shapes;

public class Rectangle {

    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {}

    public double getPerimeter( ){
        return (length * 2) + (width * 2);
    }

    public double getArea(){
        return length * width;
    }
}

