package Models;

public class Volunteer {
     public String Volunteer_ID;
     public String Volunteer_Name;
     public String Task;
     public String Supervisor;
     
     public Volunteer(String Volunteer_ID, String Volunteer_Name, String Task, String Supervisor)
     {
         this.Volunteer_ID = Volunteer_ID;
         this.Volunteer_Name = Volunteer_Name;
         this.Task = Task;
         this.Supervisor = Supervisor;
     }
     
     public void Add_Details()
     {
         
     }
     public String tostring()
     {
         return "Volunteer_ID" + this.Volunteer_ID  + "Volunteer_Name" + this.Volunteer_Name + "Task" + this.Task + "Supervisor" + this.Supervisor;
     }
}
