package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

public class LoginValidator {
	
	//public String connectionURL = "jdbc:sqlserver://localhost:1433;" +"databaseName=MARCADO;user=Pavan;password=wireless";
	public String connectionURL = "jdbc:mysql://localhost:3306/MARCADO?user=root&password=mysql";
	
	private boolean validUser=false;
	
	public boolean isAuthenticatedUser(HttpServletRequest request)
	{
		
		System.out.println("Inside LoginValidator isAuthenticatedUser**********");
		Connection conn = null;
		Statement statement = null;
		ResultSet resultSet;
		
		try{
			
			String driverClass = "com.mysql.jdbc.Driver";
			Class.forName(driverClass);
			
			conn = DriverManager.getConnection(connectionURL);
			statement = conn.createStatement();
			
			String sqlStmt = "SELECT * FROM USER_DETAILS WHERE U_ID="+request.getParameter("UID")+" and U_PASSWORD='"+request.getParameter("Password")+"'";
			
			resultSet = statement.executeQuery(sqlStmt);
			
			if(resultSet.next())
				validUser = true;
			else
				validUser = false;
			
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(conn != null)
	    		{
	    			if(!conn.isClosed())
	    			{
		    			conn.close();
	    			}
	    		}
			}
			catch(SQLException exc)
			{
				exc.printStackTrace();
			}
		}
			
		return validUser;
	}
}
