import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String[] A = new String[10];
        for (int i=0;i<A.length;i++){
            A[i] = scanner.next();
        }
        for (int j=A.length-1;j>=0;j--) {
            System.out.print(A[j]);
        }       

    }
}