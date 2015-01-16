package za.co.examapp.entities;

import java.util.List;

/** Represents a module in which
 *  can be examined
 *  Created by shilton.naicker on 2015-01-15.
 */
public class Module {

    private int objid;
    private String name;
    private String id;
    private int numQuestions;
    private List<Question> questions;

    public int getObjid() {
        return objid;
    }

    public void setObjid(int objid) {
        this.objid = objid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }
}
