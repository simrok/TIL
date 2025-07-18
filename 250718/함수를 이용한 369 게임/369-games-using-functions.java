import java.util.Scanner;
public class Main {
    public static int func1(int a, int b) {
        int count=0;
        for(int i=a;i<=b;i++) {
            if(i/10==3 || i/10==6 || i/10==9 || i%10==3 || i%10==6 || i%10==9 || i%3==0) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.println(func1(A, B));
    }   
}