import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int[][] intArray = new int[3][3];

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                intArray[i][j] = scanner.nextInt() * 3;
                System.out.print(intArray[i][j] + " ");
            }
            System.out.print("\n");
        }

        scanner.close();
    }
}