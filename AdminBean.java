/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBeans;

import Entities.Admin;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless

public class AdminBean implements AdminBeanLocal {

    @PersistenceContext(unitName = "WebCalculator_With_LogicPU")
    private EntityManager em;

    @Override
    public void addAdmin(Admin admin) {
        em.persist(admin);
    }

    @Override
    public void editAdmin(Admin admin) {
        em.merge(admin);
    }
    @Override
    public void deleteAdmin(int adminId) {
        em.remove(getAdmin(adminId));
    }

    @Override
    public Admin getAdmin(int adminId) {
        return em.find(Admin.class, adminId);
    }

    @Override
    public List<Admin> getAllAdmin() {
        return null;
    }

    protected EntityManager getEntityManager() {
        return em;
        
    }
    public void savetoDataBase(Admin admin){
        getEntityManager().persist(admin);
    }
}
