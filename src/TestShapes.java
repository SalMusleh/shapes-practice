import java.util.ArrayList;
import java.util.List;

/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

public class TestShapes {
    public static void main(String[] args) {

        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create 1 Rectangle, 1 Square and 1 Circle object

        Information to create objects will be as below
         -width of the rectangle = 5.5
         -height of the rectangle = 6
         -side of the square = 2.5
         -radius of the circle = 4


         Then print each object
         And print area and perimeters of each object
         Find and print the object which has the largest area

         EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12

         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0

         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0

         Circle has the largest area as 50.24
         */
        Circle circle = new Circle();
        circle.setRadius(4);

        Square square = new Square();
        square.setSide(2.5);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(6);
        rectangle.setWidth(5.5);

        List<Shape> listOfShapes = new ArrayList<>();

        listOfShapes.add(circle);
        listOfShapes.add(rectangle);
        listOfShapes.add(square);

        double max = 0;
        Shape largestArea = null;

        for (Shape shape : listOfShapes) {
            System.out.println(shape);
            System.out.println("Area of the " + shape.getClass().getSimpleName() + " is = " + shape.area());
            System.out.println("Perimeter of the " + shape.getClass().getSimpleName() + " is = " + shape.perimeter());
            System.out.println();

            if (shape.area() > max) {
                max = shape.area();
                largestArea = shape;
            }
        }

        System.out.println(largestArea.getClass().getSimpleName() + " has the largest area as " + max);

    }
}
