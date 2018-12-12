package lk.nsbm.ems.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConn;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emssys","root","");
    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if(dbConn == null) {
            dbConn = new DBConnection();
        }
        return dbConn;
    }

    public Connection getConnection() {
        return connection;
    }
}
