import java.util.Scanner;

public class Main {
    public static int minor(int a, int b, int c) {
        if(a<=b && a<=c) {
            return a;
        } else if(a>=b && b<=c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.println(minor(a, b, c));

        sc.close();
    }
}