// 1. Register the driver - what db are we using, MySQL, Postgre etc
// 2. Create connection - connecting to the DB using credentials
// 3. Create Statement - creating an SQL query via Java code
// 4. Execute Query 
// 5. Close connection

import java.sql.*;

public class Conn {

	Connection c;
	Statement s;
	public Conn() {
		try {
			// Class.forName(com.mysql.cj.jdbc.Driver); // registering the driver, this line is commented, since Java automatically registers
														// the connection by itself after reading the classpath
			c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "root@123"); // establishing the connection
			s = c.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
