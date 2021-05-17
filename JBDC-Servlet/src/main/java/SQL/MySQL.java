package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
	
	public static Connection connector() throws ClassNotFoundException, SQLException {
        //step1 load the driver class
        Class.forName("com.mysql.jdbc.Driver");

        //step2 create  the connection object
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bnb","root","1234");

        return con;
    }

    public void closeConnector(Connection con) throws SQLException {

        //step5 close the connection object
        con.close();
    }

}
