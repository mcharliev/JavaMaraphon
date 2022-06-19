package Day_5;

public class MotorBikeTest{
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2010,"white", "yamaha");

        System.out.println(motorbike.getColor() + " " + motorbike.getModel()+ " " + motorbike.getYearOfProduct());

    }
}
