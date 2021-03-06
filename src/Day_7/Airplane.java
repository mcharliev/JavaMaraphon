package Day_7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;



    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + " год выпуска: " + year + " длина: " + length +
                " вес: " + weight + " количества топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Самолет " + airplane1.getProducer()+ " длиннее");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Самолет " + airplane2.getProducer()+ " длиннее");
        } else {
            System.out.println("длина самолетов ровна");
        }
    }
}

