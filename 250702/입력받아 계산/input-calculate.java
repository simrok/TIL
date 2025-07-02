import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = Integer.parseInt(input);
        System.out.println(a + 2);
        scanner.close();
    }
}