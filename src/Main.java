import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ваша задача - угадать число!!1");
        int l = 0;
        for (int i = 10; i <= 30; i += 10) { l++; System.out.println("Лэвэл " + l); playLevel(i); }
        System.out.println("Вы выиграли!!1");
        scanner.close();
    }
    private static void playLevel(int range) {
        int number = (int)(Math.random() * range);
        while(true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали!!1");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше!!1");
            } else {
                System.out.println("Загаданное число больше!!1");
            }
        }
    }
}