package Day_6;

public class AirplaneTest {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing",2012,74,167);
        airplane.fillUp(117000);
        airplane.fillUp(5000);

        airplane.info();
    }
}
