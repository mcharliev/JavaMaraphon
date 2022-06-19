package Day_11;

public class Test {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);
        picker.doWork();
        for (int i = 0; i <= 1500; i++) {
            picker.doWork();
        }
        picker.bonus();

        for (int i = 0; i <= 1000; i++) {
            courier.doWork();
        }
        courier.bonus();
        System.out.println(warehouse + " " + picker + " " + courier);
    }
}
