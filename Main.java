import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
                "What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"},
                2,
                "Geography"
        ));
        questions.add(new Question(
                "Which planet is known as the Red Planet?",
                new String[]{"Earth", "Mars", "Jupiter", "Saturn"},
                1,
                "Science"
        ));
        questions.add(new Question(
                "What is the largest ocean on Earth?",
                new String[]{"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"},
                3,
                "Geography"
        ));
        questions.add(new Question(
                "What is the square root of 64?",
                new String[]{"6", "7", "8", "9"},
                2,
                "Math"
        ));
        questions.add(new Question(
                "Who wrote 'Hamlet'?",
                new String[]{"Charles Dickens", "William Shakespeare", "Mark Twain", "J.K. Rowling"},
                1,
                "Literature"
        ));
        questions.add(new Question(
                "Which gas is most abundant in the Earth's atmosphere?",
                new String[]{"Oxygen", "Hydrogen", "Carbon Dioxide", "Nitrogen"},
                3,
                "Science"
        ));
        questions.add(new Question(
                "What is the capital of Japan?",
                new String[]{"Seoul", "Beijing", "Bangkok", "Tokyo"},
                3,
                "Geography"
        ));
        questions.add(new Question(
                "How many continents are there?",
                new String[]{"5", "6", "7", "8"},
                2,
                "Geography"
        ));
        questions.add(new Question(
                "Which element has the chemical symbol 'O'?",
                new String[]{"Osmium", "Oxygen", "Gold", "Silver"},
                1,
                "Science"
        ));
        questions.add(new Question(
                "Who painted the Mona Lisa?",
                new String[]{"Vincent Van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Claude Monet"},
                1,
                "Art"
        ));
        questions.add(new Question(
                "Which planet is the largest in the solar system?",
                new String[]{"Earth", "Mars", "Jupiter", "Saturn"},
                2,
                "Science"
        ));
        questions.add(new Question(
                "What is the capital of Australia?",
                new String[]{"Sydney", "Melbourne", "Canberra", "Brisbane"},
                2,
                "Geography"
        ));
        questions.add(new Question(
                "How many states are there in the United States?",
                new String[]{"48", "49", "50", "51"},
                2,
                "Geography"
        ));
        questions.add(new Question(
                "Who developed the theory of relativity?",
                new String[]{"Isaac Newton", "Albert Einstein", "Niels Bohr", "Galileo Galilei"},
                1,
                "Science"
        ));
        questions.add(new Question(
                "What is the hardest natural substance on Earth?",
                new String[]{"Gold", "Iron", "Diamond", "Platinum"},
                2,
                "Science"
        ));
        questions.add(new Question(
                "Which year did World War II end?",
                new String[]{"1942", "1943", "1944", "1945"},
                3,
                "History"
        ));
        questions.add(new Question(
                "What is the currency of Japan?",
                new String[]{"Won", "Yuan", "Yen", "Ringgit"},
                2,
                "Economy"
        ));
        questions.add(new Question(
                "Who was the first President of the United States?",
                new String[]{"Thomas Jefferson", "John Adams", "George Washington", "James Madison"},
                2,
                "History"
        ));
        questions.add(new Question(
                "What is the smallest prime number?",
                new String[]{"0", "1", "2", "3"},
                2,
                "Math"
        ));
        questions.add(new Question(
                "What is the chemical symbol for water?",
                new String[]{"HO", "H2O", "O2H", "HHO"},
                1,
                "Science"
        ));
        questions.add(new Question(
                "What is the main ingredient in guacamole?",
                new String[]{"Tomato", "Onion", "Avocado", "Pepper"},
                2,
                "Food"
        ));
        questions.add(new Question(
                "What is the speed of light in a vacuum?",
                new String[]{"150,000 km/s", "250,000 km/s", "300,000 km/s", "350,000 km/s"},
                2,
                "Science"
        ));
        questions.add(new Question(
                "Who discovered penicillin?",
                new String[]{"Marie Curie", "Albert Einstein", "Alexander Fleming", "Isaac Newton"},
                2,
                "Science"
        ));
        questions.add(new Question(
                "Which planet is closest to the sun?",
                new String[]{"Earth", "Venus", "Mercury", "Mars"},
                2,
                "Science"
        ));
        questions.add(new Question(
                "What is the primary language spoken in Brazil?",
                new String[]{"Spanish", "Portuguese", "French", "English"},
                1,
                "Geography"
        ));

        new QuizUI(questions);
    }
}
