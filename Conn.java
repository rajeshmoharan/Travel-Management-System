import java.sql.*;

public class Conn {
	
	Connection c;
	Statement s;
	
	Conn(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:myql://localhost:3306/travelmanagementsystem","root","rmrajesh");
			s=c.createStatement();
			System.out.println("Connection Succesfully");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
