import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'up' or 'down': ");
        String direction = scanner.nextLine();

        if (direction.equals("up")) {
            System.out.print("Enter a number between 20 and 30: ");
            int num = scanner.nextInt();

            if (num >= 20 && num <= 30) {
                for (int i = 20; i <= num; i++) {
                    System.out.println(i);
                }
            } else {
                System.out.println("You must enter a number between 20 and 30.");
            }
        } else if (direction.equals("down")) {
            System.out.print("Enter a number below 20: ");
            int num = scanner.nextInt();

            if (num < 20) {
                for (int i = 20; i >= num; i--) {
                    System.out.println(i);
                }
            } else {
                System.out.println("You must enter a number below 20.");
            }
        } else {
            System.out.println("Invalid direction. Please enter 'up' or 'down'.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
