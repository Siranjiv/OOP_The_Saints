package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Lecture_hall;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HallService_final {

    ResultSet rs;
    private final DatabaseConnection con;
    Connection conn;

    public HallService_final() {
        con = DatabaseConnection.getSingleConnection();

    }

    public ArrayList<Lecture_hall> SearchHall(Lecture_hall l) {
        ArrayList<Lecture_hall> hallList = new ArrayList<>();
        try {

            String query = "select * from hall where hall_no='" + l.Hall_no + "'";
            Statement st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {

                l = new Lecture_hall(rs.getString("hall_no"), rs.getInt("No_of_tables"), rs.getInt("No_of_chairs"));

                hallList.add(l);
                return hallList;
            }

        } catch (SQLException sql) {
            System.out.println("Error " + sql.getMessage());

        }
        return hallList;

    }
}
