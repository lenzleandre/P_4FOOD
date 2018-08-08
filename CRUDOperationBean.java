/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBeans;

import Entities.Calculation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mcamelo
 */
@Stateless
public class CRUDOperationBean {

    @PersistenceContext(unitName = "WebCalculator_With_LogicPU")
    private EntityManager em;

    public CRUDOperationBean() {
    }

    protected EntityManager getEntityManager() {
        return em;
    }
    
    public void savetoDataBase(Calculation calculation){
        getEntityManager().persist(calculation);

    }
    
}
