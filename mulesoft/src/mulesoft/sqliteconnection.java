package mulesoft;

import java.sql.*;

public class sqliteconnection 
{
	static Connection con=null;
	public static Connection sqlite() 
	{
		try {
		con=DriverManager.getConnection("jdbc:sqlite:mulesoft.db");
		return con;
	}catch(Exception e) {
	   	return null;
	}
	}

}
