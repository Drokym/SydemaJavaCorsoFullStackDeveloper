package connection;

import java.sql.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Connessione {
	String url = "";
	String user = "";
	String passwd = "";
	PreparedStatement query;
	static Connection con = null;

	public Connessione(String url, String user, String passwd) throws SQLException {
		this.url = url;
		this.user = user;
		this.passwd = passwd;
		con = DriverManager.getConnection(url, user, passwd);
		query = con.prepareStatement("UPDATE users SET username = ?, password = ? WHERE ID = ?");
		con.setAutoCommit(true);
	}

	public Connection getConnessione() {

		return con;

	}

	public ResultSet getUpdate(String username, String passwd, Integer id) throws SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("connection.xml");
		query = context.getBean("update", PreparedStatement.class);
		query.setString(1, username);
		query.setString(2, passwd);
		query.setInt(3, id);
		return query.executeQuery();
	}

	public ResultSet getInsert(Integer id, String username, String passwd, Integer id_anagrafica) throws SQLException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("connection.xml");
		query = context.getBean("insert", PreparedStatement.class);
		
		query.setInt(1, id);
		query.setString(2, username);
		query.setString(3, passwd);
		query.setInt(4, id_anagrafica);
		return query.executeQuery();
	}

	public ResultSet getDelete(Integer id) throws SQLException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("connection.xml");
		query = context.getBean("delete", PreparedStatement.class);
		
		query.setInt(1, id);
		return query.executeQuery();
	}

	public ResultSet getSelect(String username) throws SQLException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("connection.xml");
		query = context.getBean("select", PreparedStatement.class);
		
		query.setString(1, username);
		return query.executeQuery();
	}
	
	public ResultSet selectAll() throws SQLException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("connection.xml");
		query = context.getBean("update", PreparedStatement.class);
		
		return query.executeQuery("select * from users");
	}

}