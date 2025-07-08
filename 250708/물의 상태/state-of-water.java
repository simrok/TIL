import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int input;
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextInt();

        if (input < 0) {
            System.out.println("ice");
        }
        else if (input >= 100) {
            System.out.println("vapor");
        } else {
            System.out.println("water");
        }

        scanner.close();
    }
}