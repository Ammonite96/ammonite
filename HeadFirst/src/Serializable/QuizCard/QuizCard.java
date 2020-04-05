package Serializable.QuizCard;

public class QuizCard {
    private String questions;
    private String answer;

    public String getQuestions() {
        return questions;
    }

    public String getAnswer() {
        return answer;
    }

    public QuizCard() {
    }

    public QuizCard(String questions, String answer) {
        this.questions = questions;
        this.answer = answer;
    }
}
