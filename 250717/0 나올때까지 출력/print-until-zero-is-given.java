import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int input = scanner.nextInt();
            if (input==0) {
                break;
            } else {
                System.out.println(input);
            }
        }
        scanner.close();
    }
}