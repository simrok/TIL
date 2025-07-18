import java.util.Scanner;
public class Main {
    public static void printSquare(int num) {
        int count = 1;
        for(int i=0;i<num;i++) {
            for(int j=0;j<num;j++) {
                System.out.print(count + " ");
                count += 1;
                if(count==10) {
                    count = 1;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printSquare(n);
    }
}