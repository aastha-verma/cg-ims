package cg.ims.jsp;

import java.sql.*;  
  
public class ConnectionProvider {  
private static Connection con=null;  
static{  
try{  
Class.forName("oracle.jdbc.OracleDriver");  
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","Aastha","capgemini#123"); 
System.out.println("Its GOOD");
}catch(Exception e){}  
}  
  
public static Connection getCon(){  
    return con;  
}  
  
}  