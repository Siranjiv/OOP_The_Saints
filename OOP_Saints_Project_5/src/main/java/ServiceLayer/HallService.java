
package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Lecture_hall;

public class HallService {
    
    private final DatabaseConnection con;
    public HallService ()
    {
        con=DatabaseConnection.getSingleConnection();
    }
    
    public boolean AddHall(Lecture_hall l)
    {
        try {
        
            String query="insert into hall" + "(hall_no,No_of_tables,No_of_chairs)"+" values('"+l.Hall_no+"',"+l.table_no+","+l.chair_no+")";
            
            boolean result=con.Execute(query);
            return result;
        }catch(Exception sql)
     {          
         System.out.println("Error "+sql.getMessage());
         return false;
    }
    
    }
}
