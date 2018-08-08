/*
 * To changethis license header, choose License Headers in Project Properties.
 * To changethis template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EJBeans;

import model.Status;


/**
 *
 * @author PC
 */

public interface registerInterface {
    public Status createAccount(String email,String userName,String password,String firstname,String lastname,String country,String gender);
    public Status validate(String email, String userName);

    public Object findAll();

  }
