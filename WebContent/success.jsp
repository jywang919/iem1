<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IEM Struts 1 Demo</title>
    </head>
    <body>
        <h1>Login Success. Welcome <bean:write name="loginForm" property="userName"></bean:write></h1>
    	<a href="ListSettings.do">My Settings</a> 
    </body>
</html>
