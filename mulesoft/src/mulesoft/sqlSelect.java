package mulesoft;

import java.sql.*;

public class sqlSelect 
{
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	sqlSelect(){
		try {
		    con=sqliteconnection.sqlite();
		    pst=con.prepareStatement("select * from Movies");
		    rs=pst.executeQuery();
		    System.out.println("Name\t\t\tActor\tActress\tDirector\tYear");
		    while(rs.next()) 
            {
		        System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getInt(5));
            }
		    System.out.println("\n\n*******************************************************");
		    pst=con.prepareStatement("select * from Movies where actor='Aamir Khan'");
		    rs=pst.executeQuery();
		    System.out.println("Name\tActor\tActress\tDirector\tYear");
		    while(rs.next()) 
            {
		        System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
            }
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
