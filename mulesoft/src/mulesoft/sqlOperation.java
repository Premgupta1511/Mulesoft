package mulesoft;
import java.sql.*;
public class sqlOperation 
{
	Connection con=null;
	PreparedStatement pst=null;
	sqlOperation(){
	try {
		con=sqliteconnection.sqlite();
		pst=con.prepareStatement("Create table Movies(name varchar[50],actor varchar[45],actress varchar[45],director varchar[45],year Integer);");
		pst.executeUpdate();
		pst=con.prepareStatement("insert into Movies values('Taare Zameen par','Aamir Khan','Tisca Chopra','Aamir Khan','2007');");
		pst.executeUpdate();
		pst=con.prepareStatement("insert into Movies values('PK','Aamir Khan','Anushka Sharma','Rajkumar Hirani','2014');");
		pst.executeUpdate();
		pst=con.prepareStatement("insert into Movies values('intestellar','Matthew McConaughey','Anne Hathaway','Christopher Nolan','2014');");
		pst.executeUpdate();
		pst=con.prepareStatement("insert into Movies values('inception','Leonardo Dicaprio','Marion Cotillard','Christopher nolan','2010');");
		pst.executeUpdate();
		pst.close();
	}catch(Exception e) {
		e.printStackTrace(System.out);
	}
	}

}
