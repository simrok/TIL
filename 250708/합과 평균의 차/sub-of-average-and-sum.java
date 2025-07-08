import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int sum, avg;

        sum = a + b + c;
        avg = sum / 3;

        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum -avg);

        scanner.close();
    }
}