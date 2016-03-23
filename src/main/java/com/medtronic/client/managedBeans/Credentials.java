package com.medtronic.client.managedBeans;

/**
 * Created by martin.cuchran on 3/22/2016.
 */

import javax.enterprise.inject.Model;

@Model
public class Credentials {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
