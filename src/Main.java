import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача - угадать число!!1");
        System.out.println("Введите верхнюю границу диапазона: ");
        int range = scanner.nextInt();
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
        scanner.close();
    }
}