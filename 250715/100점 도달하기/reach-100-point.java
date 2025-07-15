import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int input;
        
        input = scanner.nextInt();

        for(int i=0;i<=100-input;i++) {
            int score = input + i;

            if (score >= 90) {
                System.out.print("A");
            } else if (score >= 80) {
                System.out.print("B");
            } else if (score >= 70) {
                System.out.print("C");
            } else if (score >= 60) {
                System.out.print("D"); 
            } else {
                System.out.print("F");
            }
            System.out.print(" ");
        }

        scanner.close();
    }
}