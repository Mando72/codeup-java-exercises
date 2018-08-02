package shapes;

public  class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double length, double width) {
        // calls the super class constructor
        super(length, width);
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2) ;
    }

    @Override
    public double getArea() {

        return length * width;
    }
}