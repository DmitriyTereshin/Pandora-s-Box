package day8;

public class Task1 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        String line = "";

        for (int i = 0; i <= 20000; i++) {
            line += (i + " ");
        }

        System.out.println((System.currentTimeMillis() - time) + " милисекунд");
        System.out.println(line);

        long time2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append((i + " "));
        }

        System.out.println((System.currentTimeMillis() - time2) + " милисекунд");
        System.out.println(stringBuilder);
    }
}
