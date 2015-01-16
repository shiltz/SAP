import za.co.examapp.entities.Answer;
import za.co.examapp.entities.Question;

import java.io.Serializable;
import java.util.Map;

/** This class represents the state of question
 * presented to the user.
 *
 * Created by shilton.naicker on 2015-01-14.
 */
public class State implements Serializable{

    private Question question;
    private Answer selectedAnswer;
    private String selectedStringAnswer;
    private int questionNumber;
    private boolean marked;

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(Answer selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public String getSelectedStringAnswer() {
        return selectedStringAnswer;
    }

    public void setSelectedStringAnswer(String selectedStringAnswer) {
        this.selectedStringAnswer = selectedStringAnswer;
    }
}
