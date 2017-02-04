# Installatie
*Download Wildfly:  http://download.jboss.org/wildfly/10.1.0.Final/wildfly-10.1.0.Final.zip
*Unzip to a folder: (e.g. D:\java)

## Add an admin user to wildfly
*Go to the unzipped wildfly folder (e.g. D:\java\wildfly-10.1.0.Final)
*Run add-user.bat
*create a new user in the Management Realm with the username admin. To do this, answer the questions with the following options:
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

*Run standalone.bat to start the wildfly server.
