package Quiz_Console_App;

import java.util.Optional;

public class Question {
    private int id;
    private String Question;



    public Question(int id, String question, String[] opt, String correctAnswer) {
        this.id = id;
        Question = question;
        this.correctAnswer = correctAnswer;
    }
    private String correctAnswer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
