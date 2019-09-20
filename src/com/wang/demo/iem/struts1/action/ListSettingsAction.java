package com.wang.demo.iem.struts1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.wang.demo.iem.struts1.form.Group;
import com.wang.demo.iem.struts1.form.AccountForm;

public class ListSettingsAction extends Action{
	
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        AccountForm userForm = (AccountForm) form;

        		userForm.setLoginName((String)request.getSession().getAttribute("name"));
        		userForm.setFirstName("Sid");
        		userForm.setEmail("Sid.Baccam@iem.com");
        		userForm.setSmartCardDn("iem001");
        		Group grp = new Group();
        		grp.setCode("001");
        		grp.setDescription("Administration");
        		
        		userForm.getAllUserGroups().clear();
        		userForm.getAllUserGroups().add(grp);
        		
        		grp = new Group();
        		grp.setCode("100");
        		grp.setDescription("Application user");
        		userForm.getAllUserGroups().add(grp);
        		
        		userForm.setSelectedUserGroupCodes(grp.getCode());
            return mapping.findForward(SUCCESS);
    }
}