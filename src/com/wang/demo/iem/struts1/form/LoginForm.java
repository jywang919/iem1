package com.wang.demo.iem.struts1.form;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm{
	
    private String userName;
    private String password;

    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
	
//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//        if (userName == null || userName.length() < 1) {
//            errors.add("userName", new ActionMessage("User Name is required"));
//        }
//        if (password == null || password.length() < 1) {
//            errors.add("password", new ActionMessage("Password is required"));
//        }
//        return errors;
//    }
}
