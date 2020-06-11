package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Postgraduate;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PostGraduateViewService {

    ResultSet rs;
    private final DatabaseConnection con;
    Connection conn;

    public PostGraduateViewService() {
        con = DatabaseConnection.getSingleConnection();

    }

    public ArrayList<Postgraduate> SearchPostGraduate(Postgraduate l) {
        ArrayList<Postgraduate> PostgraduateList = new ArrayList<>();
        try {

            String query = "select * from PostGraduate where course_no='" + l.Course + "'";
            Statement st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                l = new Postgraduate(rs.getString("course"), rs.getString("duration"), rs.getFloat("fee"), rs.getString("intake"));

                PostgraduateList.add(l);
                return PostgraduateList;
            }

        } catch (SQLException sql) {
            System.out.println("Error " + sql.getMessage());

        }
        return PostgraduateList;

    }

}
