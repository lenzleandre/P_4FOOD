/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBeans;

import Entities.Admin;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PC
 */
@Local
public interface AdminBeanLocal {

    void addAdmin(Admin admin);

    void editAdmin(Admin admin);

    void deleteAdmin(int adminId);

    Admin getAdmin(int adminId);

    List<Admin> getAllAdmin();
    
}
