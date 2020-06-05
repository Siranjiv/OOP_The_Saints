
package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Lecturer;

public class LecturerService {
    
    private final DatabaseConnection con;
    public LecturerService ()
    {
        con=DatabaseConnection.getSingleConnection();
    }
    
    public boolean AddLecturer(Lecturer l)
    {
        try {
        
            String query="insert into Lecturer" + "(Name,Pno,age,address,Gender,Salary,LID,position,emailID,subject)"+" values('"+l.name+"',"+l.table_no+","+l.chair_no+")";
            boolean result=con.Execute(query);
            return result;
        }catch(Exception sql)
     {          
         System.out.println("Error "+sql.getMessage());
         return false;
    }
}
}
