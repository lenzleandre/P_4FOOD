/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EJBeans;

import Entities.Users;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class Usersdao implements UsersdaoLocal {
    @PersistenceContext(unitName = "WebCalculator_With_LogicPU")
    private EntityManager em;
    

    @Override
    public void addUser(Users users) {
        em.persist(users);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void editUser(Users users) {
        em.merge(users);
    }

    @Override
    public void deleteUser(int userId) {
        em.remove(userId);
    }

    @Override
    public Users getUser(int userId) {
        
        return em.find(Users.class, userId);
    }

    @Override
    public List<Users> getAllUsers() {
        return em.createNamedQuery("Users.getAll").getResultList();
    }
    protected EntityManager getEntityManager() {
        return em;
    }
    public void savetoDataBase(Users users){
        getEntityManager().persist(users);
    }

   
}
