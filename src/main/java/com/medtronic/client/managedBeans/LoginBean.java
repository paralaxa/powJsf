package com.medtronic.client.managedBeans;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by martin.cuchran on 3/22/2016.
 */
@SessionScoped
@ManagedBean(name="login")
public class LoginBean implements Serializable {
    private static final long serialVersionUID = -7665912439280494601L;

    @Inject
    private Credentials credentials;

    private User user;

    public void login() {
        // DB
        if (credentials.getUsername().equalsIgnoreCase("ADMIN")
                && credentials.getPassword().equals("password")) {
            user = new User();
            user.setUsername(credentials.getUsername());
            user.setPassword(credentials.getPassword());
        }
    }

    public void logout() {
        user = null;
    }

    public boolean isLoggedIn() {
        return user != null;
    }

    @Produces
    User getCurrentUser() throws Exception {
        if (user == null) {
            throw new Exception("Not logged in");
        } else {
            return user;
        }
    }

}

