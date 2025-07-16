import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] inputArray = new int[input];

        int count = 0;
        for(int i=0;i<input;i++) {
            int num = scanner.nextInt();
            if (num%2 == 0) {
                inputArray[count] = num;
                count ++;
            }
        } 
        for(int i=count-1;i>=0;i--) {
            System.out.print(inputArray[i] + " ");
        }
    }
}