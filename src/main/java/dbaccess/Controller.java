package dbaccess;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("controller")
@SessionScoped
public class Controller implements Serializable{
    
    @Inject DBFacade dbfacade;

    List persons;

    public List getPersons() {
        persons = dbfacade.findAll();
        return persons;
    }

//    public void setPersons(List persons) {
//        this.persons = persons;
//    }
    

    
}
