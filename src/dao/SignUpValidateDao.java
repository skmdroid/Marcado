package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import dto.UserDetailsDto;
//import org.apache.log4j.Logger;

public class SignUpValidateDao {
	
	//Logger log = Logger.getLogger(SignUpValidateDao.class.getName());
	
	//public String connectionURL = "jdbc:sqlserver://localhost:1433;" +"databaseName=MARCADO;user=Pavan;password=wireless";
	
	public String connectionURL = "jdbc:mysql://localhost:3306/MARCADO?user=root&password=mysql";
	Connection conn = null;
	private int idPresent;

	public int checkIfValidUser(String inputUID)
	{
		//log.debug("***** Inside checkIfValidUser SignUpValidateDao inputUID = "+inputUID);
		
		System.out.println("***** Inside checkIfValidUser SignUpValidateDao inputUID = "+inputUID);
		Statement statement1 , statement2 = null;
		ResultSet resultSet1,resultSet2;
		
		try{
			String driverClass = "com.mysql.jdbc.Driver";
			Class.forName(driverClass);
			
			conn = DriverManager.getConnection(connectionURL);
			statement1 = conn.createStatement();
			statement2 = conn.createStatement();
			
			String sqlStmt1 = "SELECT * FROM REG_NUM_LIST WHERE U_ID="+inputUID;
			String sqlStmt2 = "SELECT * FROM USER_DETAILS WHERE U_ID="+inputUID;
			
			resultSet1 = statement1.executeQuery(sqlStmt1);
			resultSet2 = statement2.executeQuery(sqlStmt2);
			
			System.out.println("resultSet1 and resultSet2 ---");
			
			if(resultSet1.next() && !resultSet2.next())
				idPresent = 1;
			else
				idPresent = 0;
			
			System.out.println("idPresent---"+idPresent);
						
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
		
		return idPresent;
	}
	
	public void insertUserDetails(UserDetailsDto usrDtlsObj)
	{
		
		System.out.println("*** inside insertUserDetails SignUpValidateDao****");
		Statement statement = null;
		
		try{
			String driverClass = "com.mysql.jdbc.Driver";
			Class.forName(driverClass);
			
			conn = DriverManager.getConnection(connectionURL);
			statement = conn.createStatement();
			
			String sqlStmt = "INSERT INTO USER_DETAILS VALUES ("+usrDtlsObj.getU_ID()
								+",'"+usrDtlsObj.getU_Fname()+"','"+usrDtlsObj.getU_Lname()
								+"',"+usrDtlsObj.getContact()+",'"+usrDtlsObj.geteMail()
								+"','"+usrDtlsObj.getAddr()+"','"+usrDtlsObj.getGender()
								+"','"+usrDtlsObj.getInstitution()+"','"+usrDtlsObj.getCourse()
								+"',"+usrDtlsObj.getStartYear()+","+usrDtlsObj.getLastYear()
								+",'"+usrDtlsObj.getPassword()+"')";
			
			statement.executeUpdate(sqlStmt);
			
			if(conn != null)
    		{
    			if(!conn.isClosed())
    			{
	    			conn.close();
    			}
    		}
			
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
