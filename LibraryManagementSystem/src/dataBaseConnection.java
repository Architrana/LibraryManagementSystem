import java.sql.*;


/*
 * 1) import java.sql
 * 2) load and register the driver
 * 3) Create a connection
 * 4) create a Statement
 * 5) execute the query
 * 6) process the result
 * 7) close
*/
	


public class dataBaseConnection {
	
	public static void main(String[] args) throws Exception 
	{
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "MySqlDB18");
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery("Select * From country");
			while(rs.next())
			{
				System.out.println( rs.getString(1));
			}
		
	}

}
