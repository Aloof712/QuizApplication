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

            System.out.println("\n" + q.getQuestion());
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
        }

        System.out.println("\n========================");
        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + "/" + bank.questions.length);
        System.out.println("========================");
    }
}