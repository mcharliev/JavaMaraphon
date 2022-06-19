package Day_17;

public enum Season {
    SUMMER(25), AUTUMN(10), WINTER(-20), SPRING(20);
    private int temp;

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}
