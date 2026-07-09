import java.util.Scanner;

public class Quiz {

    QuestionBank bank = new QuestionBank();
    Scanner input = new Scanner(System.in);

    int score = 0;

    public void start() {

        System.out.println("=================================");
        System.out.println("        JAVA QUIZ");
        System.out.println("=================================");

        for (Question q : bank.questions) {

            System.out.println("\n" + q.question);
            System.out.println("A. " + q.optionA);
            System.out.println("B. " + q.optionB);
            System.out.println("C. " + q.optionC);
            System.out.println("D. " + q.optionD);

            System.out.print("Your Answer: ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase(q.correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer: " + q.correctAnswer);
            }
        }

        System.out.println("\n========================");
        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + "/" + bank.questions.length);
        System.out.println("========================");
    }
}