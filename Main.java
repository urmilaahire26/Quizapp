import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Adding 20 programming-related questions to the quiz
        quiz.addQuestion(new Question(
                "What is the output of 5 + 2 * 3 in Java?",
                Arrays.asList("11", "21", "15", "17"),
                0
        ));
        
        quiz.addQuestion(new Question(
                "Which keyword is used to define a class in Java?",
                Arrays.asList("define", "class", "object", "new"),
                1
        ));
        
        quiz.addQuestion(new Question(
                "In Java, which data type is used to create a variable that should store text?",
                Arrays.asList("String", "int", "float", "char"),
                0
        ));
        
        quiz.addQuestion(new Question(
                "What does IDE stand for in programming?",
                Arrays.asList("Integrated Development Environment", "Integrated Design Environment", "Internal Development Engine", "Integrated Debugging Environment"),
                0
        ));
        
        quiz.addQuestion(new Question(
                "Which method is the entry point for any Java program?",
                Arrays.asList("main()", "start()", "init()", "launch()"),
                0
        ));

        quiz.addQuestion(new Question(
                "What is the output of the following code?\nSystem.out.println(10 / 3);",
                Arrays.asList("3", "3.3333", "3.0", "None of these"),
                0
        ));
        
        quiz.addQuestion(new Question(
                "Which of the following is not a primitive data type in Java?",
                Arrays.asList("int", "String", "boolean", "char"),
                1
        ));

        quiz.addQuestion(new Question(
                "What symbol is used to comment out a single line in Java?",
                Arrays.asList("/*", "//", "#", "--"),
                1
        ));

        quiz.addQuestion(new Question(
                "Which loop is guaranteed to execute at least once?",
                Arrays.asList("for loop", "while loop", "do-while loop", "enhanced for loop"),
                2
        ));

        quiz.addQuestion(new Question(
                "What is the size of an int variable in Java?",
                Arrays.asList("16 bits", "8 bits", "32 bits", "64 bits"),
                2
        ));

        quiz.addQuestion(new Question(
                "Which of the following is used to find the length of an array in Java?",
                Arrays.asList("array.length()", "array.size()", "array.length", "array.getLength()"),
                2
        ));

        quiz.addQuestion(new Question(
                "Which keyword in Java is used to inherit a class?",
                Arrays.asList("implements", "extends", "inherits", "parent"),
                1
        ));

        quiz.addQuestion(new Question(
                "Which exception is thrown when a program divides by zero?",
                Arrays.asList("ArithmeticException", "NullPointerException", "NumberFormatException", "ArrayIndexOutOfBoundsException"),
                0
        ));

        quiz.addQuestion(new Question(
                "What does the 'this' keyword refer to in Java?",
                Arrays.asList("Current class", "Current object", "Parent class", "Child class"),
                1
        ));

        quiz.addQuestion(new Question(
                "Which access modifier makes a member accessible only within its own package?",
                Arrays.asList("public", "private", "protected", "default"),
                3
        ));

        quiz.addQuestion(new Question(
                "Which keyword is used to define an interface in Java?",
                Arrays.asList("abstract", "class", "interface", "extends"),
                2
        ));

        quiz.addQuestion(new Question(
                "Which function in Java converts a string to an integer?",
                Arrays.asList("Integer.valueOf()", "parseInt()", "Integer.toInt()", "String.toInt()"),
                1
        ));

        quiz.addQuestion(new Question(
                "What is the output of the following code?\nSystem.out.println(\"Java\".charAt(2));",
                Arrays.asList("J", "a", "v", "None of these"),
                1
        ));

        quiz.addQuestion(new Question(
                "Which of the following is used for error handling in Java?",
                Arrays.asList("try-catch", "if-else", "loop", "class"),
                0
        ));

        quiz.addQuestion(new Question(
                "What does OOP stand for?",
                Arrays.asList("Object-Oriented Programming", "Object-Operation Process", "Orientation of Programs", "Object-Oriented Processor"),
                0
        ));

        // Start the quiz
        quiz.start();
    }
}

