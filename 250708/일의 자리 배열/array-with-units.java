import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[10];

        for(int i=0;i<2;i++) {
            intArray[i] = scanner.nextInt();
        }
        for(int i=2;i<10;i++) {
            if ((intArray[i-2]+intArray[i-1])%10 >=10) { 
                intArray[i] =  (intArray[i-2]+intArray[i-1])%100;
            } else {
                intArray[i] =  (intArray[i-2]+intArray[i-1])%10;
            }
        }
        for(int i=0;i<10;i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}