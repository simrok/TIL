import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int input, output;
        input = scanner.nextInt();
        System.out.println(input);
        if (input <= 0) {
            System.out.println("minus");
        }

        scanner.close();
    }
}