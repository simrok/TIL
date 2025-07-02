import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int inputInt = Integer.parseInt(input);
        if (inputInt >= 1 && inputInt <= 1000){
            System.out.println("Your score is " + inputInt + " point.");
        }   
    }
}   