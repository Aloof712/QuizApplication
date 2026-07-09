public class Quiz {

    QuestionBank bank = new QuestionBank();

    public void start() {

        for (Question q : bank.questions) {

            System.out.println("--------------------------------");
            System.out.println(q.question);
            System.out.println("A. " + q.optionA);
            System.out.println("B. " + q.optionB);
            System.out.println("C. " + q.optionC);
            System.out.println("D. " + q.optionD);
            System.out.println();

        }

    }

}