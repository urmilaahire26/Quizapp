import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            List<String> options = question.getOptions();

            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            int userAnswer = 0;
            boolean isValidInput = false;

            // Input validation loop
            while (!isValidInput) {
                System.out.print("Enter your answer (1-" + options.size() + "): ");
                try {
                    userAnswer = Integer.parseInt(scanner.nextLine());
                    if (userAnswer < 1 || userAnswer > options.size()) {
                        System.out.println("Please enter a valid option number.");
                    } else {
                        isValidInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }

            if (question.isCorrectAnswer(userAnswer - 1)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + options.get(question.getCorrectAnswerIndex()));
            }
            System.out.println();
        }

        System.out.println("Quiz over! Your score: " + score + "/" + questions.size());
        scanner.close();
    }
}
