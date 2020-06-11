package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection_Viewing {

    private final String URL = "jdbc:sqlserver://DESKTOP-9F7781K:1433;databaseName=Saint_Project;user=sa;password=123";

    private Connection conn;
    private static DatabaseConnection_Viewing instance;

    private DatabaseConnection_Viewing() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL);
        } catch (ClassNotFoundException ex) {
            System.out.println("Class is missing");
        } catch (SQLException ex) {
            System.out.println("Cannot connect");

        }
    }

    public static DatabaseConnection_Viewing getSingleConnection() {
        try {
            if (instance == null) {
                instance = new DatabaseConnection_Viewing();
                return instance;
            } else if (instance.conn.isClosed()) {
                instance = new DatabaseConnection_Viewing();
                return instance;
            } else {
                return instance;
            }
        } catch (SQLException ex) {
            System.out.println("Something Went wrong with server");
        }
        return null;
    }

    public ResultSet Execute(String query) throws SQLException {

        Statement st = conn.createStatement();
        ResultSet result = st.executeQuery(query);
        return result;
    }
}
