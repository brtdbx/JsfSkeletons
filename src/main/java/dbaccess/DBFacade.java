package dbaccess;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class DBFacade  {
    @PersistenceContext(unitName = "com.br_JsfSkeletons_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }
    
        public List<Person> findAll() {
            Query query = em.createNamedQuery("Person.findAll");
            List list = query.getResultList();
            return list;
            
    }
}
