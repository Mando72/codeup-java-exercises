package shapes;

public class ShapeTest {

    public static void main(String[] args){
//        System.out.println("Rectangle...");
//        Rectangle box1 = new Rectangle(2, 3);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        System.out.println("Square...");
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//
//
//        System.out.println(box1.length);

        Measurable myShape1 = new Square(5,5);
        System.out.println(myShape1.getPerimeter());
        Measurable myShape2 = new Rectangle(5,10);
        System.out.println(myShape2.getPerimeter());

        System.out.println(myShape2.getArea()+ " " + "is the area of rectangle and , " + myShape1.getArea()+ " " + "is the area of my square.");



    }
}
