package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Lecturer;

public class LecturerService {

    private final DatabaseConnection con;

    public LecturerService() {
        con = DatabaseConnection.getSingleConnection();
    }

    public boolean AddLecturer(Lecturer l) {
        try {

            String query = "insert into Lecturer" + "(Name,Pno,age,Gender,LID,Position,Qualification,emailID,Subject)" + " values('" + l.name + "','" + l.phoneNo + "'," + l.age + ",'" + l.Gender + "','" + l.LID + "','" + l.Position + "','" + l.Qualiﬁcation + "','" + l.emailID + "','" + l.Subject + "')";
            boolean result = con.Execute(query);
            return result;
        } catch (Exception sql) {
            System.out.println("Error " + sql.getMessage());
            return false;
        }
    }
}
