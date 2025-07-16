import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "banana", "grape", "blueberry", "orange"};
        int count=0;
        char input = scanner.next().charAt(0);

        for(String fruit : fruits ) {
            if (fruit.charAt(2)==input || fruit.charAt(3)==input) {
                System.out.println(fruit);
                count += 1;
            }
        }
        System.out.println(count);
     
        scanner.close();
    }
}