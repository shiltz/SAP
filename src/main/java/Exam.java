import javax.faces.event.ActionEvent;

import java.util.List;


/**
 * Created by shilton.naicker on 2015-01-15.
 */
public interface Exam {

    public State getCurrentState();
    public void getPreviousState(ActionEvent event);
    public void getNextState(ActionEvent event);
    public List<State> getStates();

}
