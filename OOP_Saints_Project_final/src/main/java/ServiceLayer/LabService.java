package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Laboratory;

public class LabService {

    private final DatabaseConnection con;

    public LabService() {
        con = DatabaseConnection.getSingleConnection();
    }

    public boolean AddHall(Laboratory l) {
        try {

            String query = "insert into lab" + "(Lab_no,No_of_tables,No_of_chairs)" + " values('" + l.Lab_no + "'," + l.table_no + "," + l.chair_no + ")";

            boolean result = con.Execute(query);
            return result;
        } catch (Exception sql) {
            System.out.println("Error " + sql.getMessage());
            return false;
        }

    }
}
