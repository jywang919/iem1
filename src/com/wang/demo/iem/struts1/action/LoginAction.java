package com.wang.demo.iem.struts1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.wang.demo.iem.struts1.form.LoginForm;

public class LoginAction extends Action{
	
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LoginForm loginForm = (LoginForm) form;
        if (null != loginForm.getUserName() && null != loginForm.getPassword()
        		&& loginForm.getUserName().length() > 0 && loginForm.getPassword().length() > 0
        		&& loginForm.getUserName().equals(loginForm.getPassword())) {
            return mapping.findForward(SUCCESS);
        } else {
            return mapping.findForward(FAILURE);
        }
    }
}