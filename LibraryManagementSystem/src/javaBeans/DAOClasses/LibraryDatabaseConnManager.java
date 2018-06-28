package javaBeans.DAOClasses;
import java.sql.*;
import src.*;


public class LibraryDatabaseConnManager {

	
	
	public Connection connect() throws ClassNotFoundException, SQLException 
	{
	
		 if(ReadConfig.diConfig==null) {new ReadConfig();}
		String dbUrl =  (String)ReadConfig.diConfig.get("dbUrl");
		String dbUserName =  (String)ReadConfig.diConfig.get("dbUserName");
		String dbPassword =  (String)ReadConfig.diConfig.get("dbPassword");
		
		Class.forName("com.mysql.jdbc.Driver");
		return(DriverManager.getConnection(dbUrl, dbUserName, dbPassword));
	}
	

}
