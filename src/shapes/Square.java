package shapes;

public class Square extends Quadrilateral {

    public Square(double length, double width) {

        super(length, length);
    }

    @Override
    void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.length = this.width = width;
    }

    @Override
    public double getPerimeter() {

        return length * 4;
    }

    @Override
    public double getArea() {

        return length * length;
    }
}