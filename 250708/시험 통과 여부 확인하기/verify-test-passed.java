import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int input, score;

        input = scanner.nextInt();
        if (input >= 80) {
            System.out.println("pass");
        } else {
            score = 80 - input;
            System.out.printf("%d more score", score);
        }

        scanner.close();
    }
}