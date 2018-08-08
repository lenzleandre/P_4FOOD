/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EJBeans;

import Entities.Users;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PC
 */
@Local
public interface UsersdaoLocal {

    void addUser(Users users);

    void editUser(Users users);

    void deleteUser(int userId);

    Users getUser(int userId);

    List<Users> getAllUsers();
    
}
