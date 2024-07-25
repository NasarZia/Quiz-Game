import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;
    private int timeLimit; // in seconds

    public Quiz(List<Question> questions, int timeLimit) {
        this.questions = questions;
        this.score = 0;
        this.timeLimit = timeLimit;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();

        for (Question question : questions) {
            if ((System.currentTimeMillis() - startTime) / 1000 > timeLimit) {
                System.out.println("Time's up!");
                break;
            }

            System.out.println(question.getQuestion());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer - 1 == question.getCorrectAnswer()) {
                score++;
            }
        }

        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score + "/" + questions.size() + "out of 25");
        scanner.close();
    }

    public int getScore() {
        return score;
    }
}
