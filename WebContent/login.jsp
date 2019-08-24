<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IEM Struts 1 Demo</title>
    </head>
<body>
<h1>IEM Struts 1 Login</h1>
    <div style="color:red">
    	<html:errors />
    </div>
    <html:form action="/login" >
        User Name :<html:text name="loginForm" property="userName" /><br>
        Password  :<html:password name="loginForm" property="password" /><br>
        <html:submit value="Login" />
    </html:form>

</body>
</html>