package com.hums.tools.login;

import java.io.Serializable;

public class RestaurantManager extends User implements Serializable{

	private static final long serialVersionUID = 1L;

	public RestaurantManager(String firstname, String lastname, String username, String password, String email){
        super(firstname, lastname, username, password, email);
    }
}