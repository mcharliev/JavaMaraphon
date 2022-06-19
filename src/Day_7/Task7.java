package Day_7;

public class Task7 {
    public static void main(String[] args) {
        Player pl1 = new Player(90);
        Player pl2 = new Player(95);
        Player pl3 = new Player(91);
        Player.info();
        Player pl4 = new Player(96);
        Player pl5 = new Player(91);
        Player pl6 = new Player(91);
        Player.info();
        Player pl7 = new Player(91);
        Player.info();

        for (int i = 0; i < 91; i++) {
            pl3.run();
        }
        Player.info();
    }
}
