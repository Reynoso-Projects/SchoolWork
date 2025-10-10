public class Triangle implements Shape2D, Scalable {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        // TODO: assign side lengths a, b, c
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // TODO: compute area using Heron's formula
        double s = (a + b + c) / 2;
        double x = s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(x);
    }

    @Override
    public double perimeter() {
        // TODO: return sum of sides
        return a+b+c;
    }

    @Override
    public void scale(double factor) {
        // TODO: scale each side by factor
        this.a = a*factor;
        this.b = b*factor;
        this.c = c*factor;
    }

    @Override
    public String toString() {
        // TODO: return formatted string like "Triangle[a=..., b=..., c=...]"
        return "Triangle[a= " + a + ", b= " + b + ",c= " + c + "]";
    }
}
