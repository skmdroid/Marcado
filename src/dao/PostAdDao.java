package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import org.apache.catalina.connector.Request;

import dto.ProductDetailsDTO;

public class PostAdDao {
	
	public String connectionURL = "jdbc:mysql://localhost:3306/MARCADO?user=root&password=mysql";
	Connection conn = null;
	
	public void insertProdDetails(ProductDetailsDTO prodDetailsDtoObj)
	{
		
		System.out.println("***** Inside insertProdDetails PostAdDao ");
		
		Statement stmt = null;
		
		try
		{
			String driverClass = "com.mysql.jdbc.Driver";
			Class.forName(driverClass);
			
			conn = DriverManager.getConnection(connectionURL);
			stmt = conn.createStatement();
			
			String query = "INSERT INTO PRODUCTS (P_TITLE, P_CATEGORY, P_DESC, P_PRICE, P_IMAGE,U_ID) VALUES ('"
					+prodDetailsDtoObj.getProdTitle()+"','"+prodDetailsDtoObj.getProdCategory()+"','"+prodDetailsDtoObj.getProdDesc()
					+"',"+Integer.parseInt(prodDetailsDtoObj.getProdPrice())+",'"+prodDetailsDtoObj.getFullPath()+"',"+
					Integer.parseInt(prodDetailsDtoObj.getUID())+")";
			
			stmt.executeUpdate(query);
			
			System.out.println("***** Inside insertProdDetails PostAdDao Data inserted to DB successfully ==== ");
			
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
