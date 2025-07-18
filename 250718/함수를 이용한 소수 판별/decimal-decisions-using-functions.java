import java.util.Scanner;

public class Main {

    // 소수인지 판별하는 함수
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // A 이상 B 이하의 소수들의 합을 구하는 함수
    public static int sumOfPrimes(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(sumOfPrimes(A, B));
    }
}
