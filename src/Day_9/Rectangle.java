package Day_9;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double S = width * height;
        return S;
    }

    @Override
    public double perimeter() {
        double P = (width + height) * 2;
        return P;
    }
}
