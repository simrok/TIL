import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double n = Double.parseDouble(input);
        System.out.printf("%.2f", n);
    }
}