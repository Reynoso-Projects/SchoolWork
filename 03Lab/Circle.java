public class Circle implements Shape2D, Scalable {
    private double radius;

    public Circle(double radius) {
        // TODO: assign radius
        this.radius = radius;
    }

    @Override
    public double area() {
        // TODO: compute circle area
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        // TODO: compute circle circumference
        return 2*Math.PI*radius;
    }

    @Override
    public void scale(double factor) {
        // TODO: scale radius by factor
        radius = radius*factor;
    }

    @Override
    public String toString() {
        // TODO: return formatted string like "Circle[r=...]"
        return "Circle[r= " + radius +"]";
    }
}
