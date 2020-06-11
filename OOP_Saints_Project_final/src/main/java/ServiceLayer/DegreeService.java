package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Degree;

public class DegreeService {

    private final DatabaseConnection con;

    public DegreeService() {
        con = DatabaseConnection.getSingleConnection();
    }

    public boolean AddDegree(Degree l) {
        try {
            if (l.U_degree == true) {
                String query = "insert into UnderGraduate" + "(course,duration,fee,intake)" + " values('" + l.Course + "','" + l.Duration + "'," + l.fee + ",'" + l.intake + "')";
                boolean result = con.Execute(query);
                return result;
            } else {
                String query = "insert into PostGraduate" + "(course,duration,fee,intake)" + " values('" + l.Course + "','" + l.Duration + "'," + l.fee + ",'" + l.intake + "')";
                boolean result = con.Execute(query);
                return result;
            }

        } catch (Exception sql) {
            System.out.println("Error " + sql.getMessage());
            return false;
        }

    }

}
