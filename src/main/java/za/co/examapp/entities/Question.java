package za.co.examapp.entities;

import java.io.Serializable;
import java.util.List;

/** Question Entity
 * Created by shilton.naicker on 2015-01-14.
 */
public class Question implements Serializable{

    private int objid;
    private String question;
    private String language;
    private List<Answer> possibleAnswers;
    private List<Answer>answers;

    public int getObjid() {
        return objid;
    }

    public void setObjid(int objid) {
        this.objid = objid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Answer> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(List<Answer> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public List<Answer> getAnswer() {
        return answers;
    }

    public void setAnswer(List<Answer> answers) {
        this.answers = answers;
    }
}
