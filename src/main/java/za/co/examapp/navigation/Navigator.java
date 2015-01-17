package za.co.examapp.navigation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/** Handles the navigation within the application
 * Created by shilton.naicker on 2015-01-15.
 */
@Named
@RequestScoped
public class Navigator {

    public Navigator(){

    }


    public String getReviewedOutcome(){

        return "success";
    }

    public String getQuestionOutcome(){
        return "success";
    }
}
