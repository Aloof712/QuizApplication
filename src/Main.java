import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      WELCOME TO JAVA QUIZ");
        System.out.println("=================================");
        System.out.println("1. Start Quiz");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Quiz will start soon...");
        } else if (choice == 2) {
            System.out.println("Thank you for using the Quiz!");
        } else {
            System.out.println("Invalid choice!");
        }

        input.close();
    }
}