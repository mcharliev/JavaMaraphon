package Day_8;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public Car abc(String color) {
        Car c10 = new Car(color, "V4");
        return c10;
    }

    @Override
    public String toString() {
        return "Car " +
                color + " " +
                engine;
    }

    public static void main(String[] args) {
        Car c = new Car("Red", "V6");
        Car c2 = c.abc("black");
        System.out.println(c.color  );
    }

}

