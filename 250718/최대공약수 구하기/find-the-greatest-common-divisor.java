import java.util.Scanner;

public class Main {

    // 최대공약수를 구하는 함수 (유클리드 호제법 사용)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 최대공약수 출력
        System.out.println(gcd(n, m));

        scanner.close();
    }
}
