package za.co.examapp.entities;

import java.io.Serializable;
import java.util.List;

/** Answer Entity
 * Created by shilton.naicker on 2015-01-14.
 */
public class Answer implements Serializable{

    private int objid;
    private List<Question>questions;
    private String answer;

    public int getObjid() {
        return objid;
    }

    public void setObjid(int objid) {
        this.objid = objid;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
