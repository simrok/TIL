import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int A, B, C, middle;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        if ((A>=B && A<=C) || (A<=B && A>=C)) {
            middle = A;
        } else if ((B>=A && B<=C) || (B<=A && B>=C)) {
            middle = B;
        } else {
            middle = C;
        }
        System.out.println(middle);
    }
}