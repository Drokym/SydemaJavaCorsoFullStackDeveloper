package jdbcTest;
import java.sql.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import connection.Connessione;

public class jdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("connection.xml");
			Connessione connect = context.getBean("conOracle", Connessione.class);
			Connection con = connect.getConnessione();
			//System.out.println(con.isClosed());
			Statement stmt=con.createStatement();
			connect.getInsert(13, "ricky", "zomzomzom",2);
			ResultSet rs=connect.selectAll();
			while(rs.next())  
			System.out.println(rs.getInt("id")+" | "+rs.getString("username")+" | "+rs.getString("password"));
			con.close();  
		} catch ( Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
