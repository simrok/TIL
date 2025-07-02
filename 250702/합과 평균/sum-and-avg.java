import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a, b, sum;
        double avg;
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;
        avg = (a + b) / 2.0;

        System.out.printf("%d %.1f", sum, avg);
        sc.close();
    }
}