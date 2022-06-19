package Day_9;

public class Triangle extends Figure {
    int x;
    int y;
    int z;

    public Triangle(String color, int x, int y, int z) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double area() {
        double halfP = 0.5 * (x + y + z);
        double number = halfP * (halfP - x) * (halfP - y) * (halfP - z);
        double S = Math.sqrt(number);
        return S;
    }

    @Override
    public double perimeter() {
        double P = x + y + z;
        return P;
    }
}
