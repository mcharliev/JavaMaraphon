package Day_9;

public class Circle extends Figure {
    private double circleRadius;

    public Circle(String color, int circleRadius) {
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        double S = Math.PI * (circleRadius * circleRadius);
        return S;
    }


    @Override
    public double perimeter() {
        double P = 2 * Math.PI * circleRadius;
        return P;
    }
}
