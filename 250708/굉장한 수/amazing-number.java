import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int input;

        input = scanner.nextInt();

        if ((input%2!=0 && input%3==0) || (input%2==0 && input%5==0)) {
            System.out.println("true");
        } else  System.out.println("false");
    }
}