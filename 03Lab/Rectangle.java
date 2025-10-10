public class Rectangle implements Shape2D, Scalable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        // TODO: assign width and height
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        // TODO: compute rectangle area
        return height*width;
    }

    @Override
    public double perimeter() {
        // TODO: compute rectangle perimeter
        return 2*(height+width);
    }

    @Override
    public void scale(double factor) {
        // TODO: scale width and height by factor
        height = height*factor;
        width = width*factor;
    }

    @Override
    public String toString() {
        // TODO: return formatted string like "Rectangle[w=..., h=...]"
        return "Rectangle[w= "+ width + ", h= " + height + "]";
    }
}
