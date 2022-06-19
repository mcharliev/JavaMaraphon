package Day_6;

public class Car {
    private int yearOfProduct;
    private String color;
    private String model;

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public void setYearOfProduct(int yearOfProduct) {
        this.yearOfProduct = yearOfProduct;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int yearOfProduct) {
        yearOfProduct = yearOfProduct - this.yearOfProduct;
        return yearOfProduct;
    }
}
