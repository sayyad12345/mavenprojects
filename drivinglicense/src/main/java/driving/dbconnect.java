package driving;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnect {
	private static final String URL = "jdbc:postgresql://localhost:5432/girish";
	private static final String USER = "postgres";
	private static final String PASSWD = "123";

	

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER,PASSWD);
	}


		
	}

