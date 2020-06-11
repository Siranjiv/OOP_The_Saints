package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Undergraduate;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UnderGraduateViewService {

    ResultSet rs;
    private final DatabaseConnection con;
    Connection conn;

    public UnderGraduateViewService() {
        con = DatabaseConnection.getSingleConnection();

    }

    public ArrayList<Undergraduate> SearchUnderGraduate(Undergraduate l) {
        ArrayList<Undergraduate> UndergraduateList = new ArrayList<>();
        try {

            String query = "select * from UnderGraduate where course='" + l.Course + "'";
            Statement st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                l = new Undergraduate(rs.getString("course"), rs.getString("duration"), rs.getFloat("fee"), rs.getString("intake"));

                UndergraduateList.add(l);
                return UndergraduateList;
            }

        } catch (SQLException sql) {
            System.out.println("Error " + sql.getMessage());

        }
        return UndergraduateList;

    }
}
