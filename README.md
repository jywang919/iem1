# Sample project demonstrates Struts 1

- Clone the project into your eclipse workspace

		1. Add a server run time

		2. Add your local JRE to the project lib

- Test the project:
	
	Right click on the project -> Run As -> Run on Server 
	
	Copy this URL to the browser: http://localhost:8080/iem1
	
	The browser will show the login page
	
	Type same in the user name and password will direct to a welcome page
	
	otherwise, a failure page will be displayed
	
- Remote debugging
	copy setenv.sh(.bat to tomcat bin folder) -> start tomcat:  startup.sh
	
	in Eclipse, 
	
	Add break points in classes
	
	Debug Configurations -> Remote Java Application
	project:iem1  (or browse)
	Connection Type: Standard (Socket Attach)
	Host: Localhost
	port: 8787
	Apply -> Debug
	
	
	