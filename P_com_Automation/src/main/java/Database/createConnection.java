package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class createConnection {
/*
 * This class sets an connection with oracle SQL developer
 *  and return the created connection object.
 */
	public Connection setConnection(){
		try
	    {
	      // Step 1: "Load" the JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

	      // Step 2: Establish the connection to the database 
			Connection con=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
			return con;
	    }
	    catch (Exception e)
	    {
	      System.err.println("D'oh! Got an exception!"); 
	      System.err.println(e.getMessage()); 
	    }
		return null; 
	  } 
	} 

