import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) { // 생성자
        this.value = value;
    }
}

public class Main {
    public static void swap(IntWrapper a, IntWrapper b) {
        int temp = 0;
        temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        IntWrapper a = new IntWrapper(n);
        IntWrapper b = new IntWrapper(m);
        
        swap(a, b);
        System.out.println(a.value + " " + b.value);

        sc.close();

    }
}