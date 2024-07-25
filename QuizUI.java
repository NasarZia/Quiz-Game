import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizUI {
    private JFrame frame;           // Main window
    private JLabel questionLabel;   // Question label
    private JRadioButton[] options; // Array of radio buttons for options
    private JButton nextButton;     // Next button
    private ButtonGroup group;      // Group of radio buttons
    private int currentQuestionIndex; // Current question index
    private List<Question> questions; // List of questions
    private int score;              // User score
    private Timer timer;            // Timer for each question
    private JLabel timerLabel;      // Timer label
    private int timeLeft;           // Time left for current question

    public QuizUI(List<Question> questions) {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.score = 0;

        frame = new JFrame("Quiz Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(7, 1));

        timerLabel = new JLabel("", JLabel.CENTER);
        frame.add(timerLabel);

        questionLabel = new JLabel("", JLabel.CENTER);
        frame.add(questionLabel);

        options = new JRadioButton[4];
        group = new ButtonGroup();
        for (int i = 0; i < options.length; i++) {
            options[i] = new JRadioButton();
            group.add(options[i]);
            frame.add(options[i]);
        }

        nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timer != null) {
                    timer.cancel();
                }
                checkAnswer();
                currentQuestionIndex++;
                if (currentQuestionIndex < questions.size()) {
                    loadQuestion(questions.get(currentQuestionIndex));
                } else {
                    JOptionPane.showMessageDialog(frame, "Quiz finished! Your score: " + score + "out of 25");
                    frame.dispose();
                }
            }
        });
        frame.add(nextButton);

        loadQuestion(questions.get(currentQuestionIndex));
        frame.setVisible(true);
    }

    private void loadQuestion(Question question) {
        questionLabel.setText(question.getQuestion());
        String[] optionsText = question.getOptions();
        for (int i = 0; i < options.length; i++) {
            options[i].setText(optionsText[i]);
            options[i].setSelected(false);  // Clear previous selection
        }
        group.clearSelection();  // Clear selection in the button group
        startTimer();
    }

    private void startTimer() {
        timeLeft = 5; // 5 seconds for each question
        timerLabel.setText("Time left: " + timeLeft + " seconds");
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> {
                    timeLeft--;
                    timerLabel.setText("Time left: " + timeLeft + " seconds");
                    if (timeLeft <= 0) {
                        timer.cancel();
                        nextButton.doClick();
                    }
                });
            }
        }, 1000, 1000); // Schedule task to run every second
    }

    private void checkAnswer() {
        int selectedOption = -1;
        for (int i = 0; i < options.length; i++) {
            if (options[i].isSelected()) {
                selectedOption = i;
                break;
            }
        }
        if (selectedOption == questions.get(currentQuestionIndex).getCorrectAnswer()) {
            score++;
        }
    }

    public int getScore() {
        return score;
    }
}
