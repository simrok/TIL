import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String a, b;
        a = scanner.next();
        b = scanner.next();
        if (a.length()>b.length() && a.length()<=20) {
            System.out.println(a + " " + a.length());
        } else if (a.length()<b.length() && b.length()<=20){
            System.out.println(b + " " + b.length());
        } else if (a.length()==b.length() && a.length()<=20 && b.length()<=20) {
            System.out.println("same");
        }

        scanner.close();
    }
}