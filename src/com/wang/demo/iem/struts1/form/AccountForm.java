package com.wang.demo.iem.struts1.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class AccountForm extends ActionForm{
	
	   private String logonId;
	   
	   private String lastName;
	   private String middleInitial;
	   private String firstName;
	   private int marks;
	   private String state;

	   private String loginName;
	   
	   private String email;
	   
	   private String distinguishedName;
	   
	   private String smartCardDn;
	   
	   private String selectedUserGroupCodes;
	   
	   private List<Group>  allUserGroups= new ArrayList<Group>();
	   
	    public AccountForm() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    
	    public AccountForm(String firstName, String lastName, int marks, String state) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.marks=marks;
	        this.state = state;
	    }
	    
   
   public String getLogonId() {
			return logonId;
		}

		public void setLogonId(String logonId) {
			this.logonId = logonId;
		}

public String getLastName() {
      return lastName;
   }
   
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   
   
   public String getMiddleInitial() {
	return middleInitial;
}

public void setMiddleInitial(String middleInitial) {
	this.middleInitial = middleInitial;
}

public String getFirstName() {
      return firstName;
   }
   
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   
   public int getMarks() {
      return marks;
   }
   
   public void setMarks(int marks) {
      this.marks = marks;
   }

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}


public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getSmartCardDn() {
	return smartCardDn;
}

public void setSmartCardDn(String smartCardDn) {
	this.smartCardDn = smartCardDn;
}

public String getLoginName() {
	return loginName;
}


public void setLoginName(String loginName) {
	this.loginName = loginName;
}


public String getSelectedUserGroupCodes() {
	return selectedUserGroupCodes;
}

public void setSelectedUserGroupCodes(String selectedUserGroupCodes) {
	this.selectedUserGroupCodes = selectedUserGroupCodes;
}

public String getDistinguishedName() {
	return distinguishedName;
}

public void setDistinguishedName(String distinguishedName) {
	this.distinguishedName = distinguishedName;
}

public List<Group> getAllUserGroups() {
	return allUserGroups;
}

public void setAllUserGroups(List<Group> allUserGroups) {
	this.allUserGroups = allUserGroups;
}


}
