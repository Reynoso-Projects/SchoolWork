import java.util.*;

public class ShapeUtils {

    public static void printReport(List<Shape2D> shapes) {
        // TODO: loop through shapes and print each shape, area, and perimeter

        for (Shape2D shape : shapes){
            System.out.println(shape);
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
        }
    }

    public static double totalArea(List<Shape2D> shapes) {
        // TODO: sum up area of all shapes and return
        double a = 0;
        for(Shape2D shape : shapes) {
            a = a + shape.area();
        }

        return a;
    }

    public static double largestPerimeter(List<Shape2D> shapes) {
        // TODO: return shape with largest perimeter (first max if tie)
        double max = 0;
        for (Shape2D shape : shapes) {
            if (shape.perimeter() > max) {
                max = shape.perimeter();
            }
        }

        return max;
    }
}
