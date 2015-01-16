import za.co.examapp.entities.Answer;
import za.co.examapp.entities.Question;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/** This is the backing bean for question.xhtml
 *
 * Created by shilton.naicker on 2015-01-14.
 */
@Named("exam")
@SessionScoped
public class ExamImpl implements Serializable,Exam{

    private List<Question>questions;

    private List<State>states;

    private int currentStateNo;
    private int noQuestions;
    private int maxQuestions;
    private State currentState;

    public ExamImpl(){
        int maxQuestions = 5;
        int currentQuestionNo = 1;
        states = new ArrayList<>();
        currentStateNo = 1;

        questions = getQuestions(maxQuestions);
        initialiseStates();
        noQuestions = questions.size();
    }

    /**
     * initialise the user's questions that they
     * will be asked. Each question and answer selected
     * is called a state.
     */
    private void initialiseStates(){
        for(int k =1 ; k<=questions.size();k++){

            State state = new State();
            state.setMarked(false);
            state.setQuestion(questions.get(k - 1));
            state.setQuestionNumber(k);
            states.add(state);
            if(k == 1){
                this.currentState = state;
            }
        }

    }

    /**
     * TO COMPLETE
     * @param numQuestions
     * @return
     */
    private List<Question> getQuestions(int numQuestions){


        Answer a1 = new Answer();
        a1.setAnswer("1");
        Answer a2 = new Answer();
        a2.setAnswer("2");
        Answer a3 = new Answer();
        a3.setAnswer("3");
        Question q1 = new Question();
        List<Answer>answersC = new LinkedList<>();
        answersC.add(a2);
        q1.setAnswer(answersC);
        q1.setQuestion("1 + 1");
        List<Answer>answers = new LinkedList<>();
        answers.add(a1);
        answers.add(a3);
        q1.setPossibleAnswers(answers);
        Question q2 = new Question();
        answersC = new LinkedList<>();
        answersC.add(a3);
        Answer a4 = new Answer();
        a4.setAnswer("33");
        answers.add(a4);
        List<Answer>answersd = new LinkedList<>();
        answersd.add(a1);
        answersd.add(a2);
        answersd.add(a3);
        answersd.add(a4);
        q2.setAnswer(answersC);
        q2.setPossibleAnswers(answersd);
        q2.setQuestion("1 + 2");
        List<Question>list = new LinkedList<>();
        list.add(q1);
        list.add(q2);


        return list;
    }



    /**
     * Retrieve the next state to the current state
     *
     */
    public void getNextState(ActionEvent event){
        currentStateNo++;
        if(currentStateNo > noQuestions) {
            throw new RuntimeException("Exceeded max questions");
        }
        else {
            this.currentState = states.get(currentStateNo-1);
        }
    }

    @Override
    public List<State>getStates() {
        return this.states;
    }

    /**
     * Retrieve the previous state to the current state
     *
     */
    public void getPreviousState(ActionEvent event){

        currentStateNo--;
        if(currentStateNo < 1) {
            throw new RuntimeException("No previous questions");
        }
        else {
            this.currentState = states.get(currentStateNo-1);
        }

    }

    /**
     * Retrieve the current state
     * @return The current state
     */
    public State getCurrentState(){
        return this.currentState;
    }




    /**
     * TO-DO
     */
    public void endExam(){
        throw new UnsupportedOperationException();
    };


}
