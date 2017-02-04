# Prerequisites
* Java 8 JDK: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* Add Java 8 to path:
```
1. Click Start, then Control Panel, then System.
2. Click Advanced, then Environment Variables.
3. Add the location of the bin folder of the JDK installation to the PATH variable in System Variables.
```
* Maven: https://maven.apache.org/download.cgi
* Add Maven to path:
```
1. Click Start, then Control Panel, then System.
2. Click Advanced, then Environment Variables.
3. click on New... and add:
M2_HOME=<your_path>
MAVEN_HOME=%M2_HOME%
MAVEN_BIN=%M2_HOME%\bin
click on Edit... and add the ;%MAVEN_BIN% at the end of the Path
```
* reopen your command prompt after adding Java 8 and Maven to the environment variables (important!)
* run java -version to check if java was properly added
* run mvn -v to check if maven was properly added

# Installatie
* Download Wildfly:  http://download.jboss.org/wildfly/10.1.0.Final/wildfly-10.1.0.Final.zip
* Unzip to a folder: (e.g. D:\java)

## Add an admin user to wildfly
* Go to the unzipped wildfly folder (e.g. D:\java\wildfly-10.1.0.Final)
* Run add-user.bat
* Create a new user in the Management Realm with the username admin. To do this, answer the questions with the following options:
```
What type of user do you wish to add? 
 a) Management User (mgmt-users.properties) 
 b) Application User (application-users.properties)
(a): a

Username : admin
Password : admin
Are you sure you want to use the password entered yes/no? yes
Re-enter Password : admin
What groups do you want this user to belong to? (Please enter a comma separated list, or leave blank for none)[  ]: 
About to add user 'admin' for realm 'ManagementRealm'
Is this correct yes/no? yes
Is this new user going to be used for one AS process to connect to another AS process? 
e.g. for a slave host controller connecting to the master or for a Remoting connection for server to server EJB calls.
yes/no? no
```

* Run standalone.bat to start the wildfly server.
* Navigate to http://localhost:9990 and login to check if the server is started correctly

# Downloading the examples
* git clone https://github.com/erwindeg/fontys-ejbcdi (first install a git client https://git-scm.com/download/win ) or
* download and unzip

# Running the examples
## Helloworld
* Navigate to fontys-ejbcdi/helloworld/helloworld
* run mvn clean install wildfly:deploy
* Navigate to http://localhost:8080/jboss-helloworld/HelloWorld
* You should see the text Hello World in your browser
