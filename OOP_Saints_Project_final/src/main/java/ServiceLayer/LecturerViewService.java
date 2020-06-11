package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Lecturer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LecturerViewService {

    ResultSet rs;
    private final DatabaseConnection con;
    Connection conn;

    public LecturerViewService() {
        con = DatabaseConnection.getSingleConnection();

    }

    public ArrayList<Lecturer> SearchLecturer(Lecturer l) {
        ArrayList<Lecturer> LecturerList = new ArrayList<>();
        try {

            String query = "select * from Lecturer where LID='" + l.LID + "'";
            Statement st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                l = new Lecturer(rs.getString("Name"), rs.getString("Pno"), rs.getInt("age"), rs.getString("Gender"), rs.getString("LID"), rs.getString("Position"), rs.getString("Qualification"), rs.getString("emailID"), rs.getString("Subject"));

                LecturerList.add(l);
                return LecturerList;
            }

        } catch (SQLException sql) {
            System.out.println("Error " + sql.getMessage());

        }
        return LecturerList;

    }
}
