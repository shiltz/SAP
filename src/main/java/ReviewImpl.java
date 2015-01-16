import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/** The backing bean for review.xhtml
 * Created by shilton.naicker on 2015-01-15.
 */

@Named("review")
public class ReviewImpl {

    @Inject
    private Exam exam;

    public List<State> getStates(){
        return exam.getStates();
    }



}
