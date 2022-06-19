package Day_5;

public class Motorbike {
    private int yearOfProduct;
    private String color;
    private String model;

    public Motorbike(int yearOfProduct, String color, String model) {
        this.yearOfProduct = yearOfProduct;
        this.color = color;
        this.model = model;
    }


    @Override
    public String toString() {
        return "yearOfProduct = "  + yearOfProduct +
                " color = " + color + '\'' +
                " model = " + model + '\''
                ;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

}




