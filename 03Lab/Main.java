import java.util.*;

public class Main {
    public static void main(String[] args) {
        // TODO: create a list of Shape2D with a Rectangle(4,7), Circle(3), Triangle(3,4,5)
        Rectangle rect = new Rectangle(4,7);
        Circle cir = new Circle(3);
        Triangle tri = new Triangle(3,4,5);
        List<Shape2D> shapes = new ArrayList<>();

        shapes.add(rect);
        shapes.add(cir);
        shapes.add(tri);
        // TODO: print original shapes using ShapeUtils.printReport
        ShapeUtils.printReport(shapes);
        // TODO: print total area and largest perimeter
        ShapeUtils.totalArea(shapes);
        ShapeUtils.largestPerimeter(shapes);
        // TODO: scale Rectangle by 0.5, Circle by 2.0, Triangle by 1.5
        rect.scale(.5);
        cir.scale(2);
        tri.scale(1.5);
        // TODO: print shapes after scaling and recompute total area and largest perimeter
        ShapeUtils.printReport(shapes);
        ShapeUtils.totalArea(shapes);
        ShapeUtils.largestPerimeter(shapes);
    }
}
