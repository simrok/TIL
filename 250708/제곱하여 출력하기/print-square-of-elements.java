import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] input = new int[num];
        scanner.nextLine();
        for (int i=0;i<num;i++) {
            input[i] = scanner.nextInt();
            System.out.print(input[i]*input[i] + " ");
        }
    }
}