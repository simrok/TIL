import java.util.Scanner;
public class Main {
    public static void magicNumber(int n) {
        int ten, one;
        ten = n / 10;
        one = n % 10;
        if(n%2==0 && (ten+one)%5==0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        magicNumber(n);
    }
}