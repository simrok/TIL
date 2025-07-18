import java.util.Scanner;

public class Main {

    // 조건을 만족하는지 확인하는 함수
    public static boolean check(int n) {
        if (n % 3 == 0) {
            return true;
        }

        String str = String.valueOf(n);
        return str.contains("3") || str.contains("6") || str.contains("9");
    }

    // A부터 B까지 검사하며 check() 함수 호출
    public static int count(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            if (check(i)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(count(A, B));
    }
}
