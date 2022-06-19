package Day_6;

public class CatTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfProduct(2010);
        car.setModel("Renault");
        car.setColor("white");
        int difYear = car.yearDifference(2050);
        System.out.println("Разница между переданным годом и годом выпуска : " + difYear);


    }
}
