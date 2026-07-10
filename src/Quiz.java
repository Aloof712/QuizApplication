import java.util.Scanner;

public class Quiz {

    QuestionBank bank = new QuestionBank();
    Scanner input = new Scanner(System.in);
    int score = 0;

    public void start() {

        boolean playAgain = true;

        while (playAgain){

        System.out.println("=================================");
        System.out.println("          JAVA QUIZ");
        System.out.println("=================================");
        System.out.println("1. Start Quiz");
        System.out.println("2. Instructions");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();
        input.nextLine(); 

        if (choice == 1) {

    startQuiz();

    System.out.print("\nDo you want to play again? (Y/N): ");
    String answer = input.nextLine();

    if (!answer.equalsIgnoreCase("Y")) {
        playAgain = false;
        System.out.println("Thank you for playing!");
    }

} else if (choice == 2) {

    showInstructions();

} else if (choice == 3) {

    System.out.println("Thank you for playing!");
    playAgain = false;

} else {

    System.out.println("Invalid choice!");

}}
}

    public void startQuiz() {

        score = 0;
        int questionNumber = 1;

        for (Question q : bank.questions) {

            System.out.println("\n---------------------------------");
            System.out.println("Question " + questionNumber);
            System.out.println("---------------------------------");

            System.out.println(q.getQuestion());
            System.out.println("A. " + q.getOptionA());
            System.out.println("B. " + q.getOptionB());
            System.out.println("C. " + q.getOptionC());
            System.out.println("D. " + q.getOptionD());

            System.out.print("Your Answer: ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase(q.getCorrectAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer: " + q.getCorrectAnswer());
            }

            questionNumber++;
        }

        System.out.println("\n=================================");
        System.out.println("        QUIZ FINISHED");
        System.out.println("=================================");
        System.out.println("Your Score : " + score + "/" + bank.questions.length);

        
    }
    public void showInstructions() {

    System.out.println("\n=================================");
    System.out.println("         INSTRUCTIONS");
    System.out.println("=================================");
    System.out.println("1. Each question has one correct answer.");
    System.out.println("2. Type A, B, C, or D.");
    System.out.println("3. Each correct answer gives 1 mark.");
    System.out.println("4. Your final score will be shown at the end.");
    System.out.println("=================================\n");

}
}