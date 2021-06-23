package day7;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private int stamina;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (this.stamina == MIN_STAMINA + 1) {
            this.stamina -= 1;
            countPlayers--;
        } else if (this.stamina > 1)
            this.stamina -= 1;
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.println("Команды неполные. На поле есть " + (6 - countPlayers) + " свободных мест");
        else System.out.println("На поле нет свободных мест");
    }
}
