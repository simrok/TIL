import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int startNum, endNum;
        int sum = 0;

        startNum = scanner.nextInt();
        endNum = scanner.nextInt();

        for(int i=startNum;i<=endNum;i++) {
            if (i%2==0) {
                sum += i;
            } else {
                continue;
            }
        }
        System.out.println(sum);

        scanner.close();
    }
}