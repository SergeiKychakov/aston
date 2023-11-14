import java.util.Scanner;

public class OverSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
