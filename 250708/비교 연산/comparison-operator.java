import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int A, B;
        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();

        if (A >= B) System.out.println("1");
        else System.out.println("0");
        if (A > B) System.out.println("1");
        else System.out.println("0");
        if (A <= B) System.out.println("1");
        else System.out.println("0");
        if (A < B) System.out.println("1");
        else System.out.println("0");
        if (A == B) System.out.println("1");
        else System.out.println("0");
        if (A != B) System.out.println("1");
        else System.out.println("0");

        scanner.close();
    }
}