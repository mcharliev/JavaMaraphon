package Day_7;

public class Player {
    private int stamina;
    private final int maxStamina = 100;
    private final int minStamina = 0;
    private static int countPlayers;


    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }


    public void run() {
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }



    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные  на поле еще есть " + (6 - countPlayers) + " свободные места");
        } else {
            System.out.println("Мест в командах больше нет");
        }
    }
}



