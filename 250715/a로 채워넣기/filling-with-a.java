import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String input, changedString;

        input = scanner.next();
        changedString = input.substring(0,1) + "a" + input.substring(2,input.length()-2) + "a" + input.substring(input.length()-1);

        System.out.println(changedString);
        scanner.close();
    }
}