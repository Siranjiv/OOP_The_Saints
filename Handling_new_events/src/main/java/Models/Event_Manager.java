package Models;

public class Event_Manager {
    public String Employee_ID;
    public String Employee_Name;
    public String Employee_Sex; 
    public int Employee_PhoneNo;
    
    public Event_Manager(String Employee_ID, String Employee_Name, String Employee_Sex, int Employee_PhoneNo)
    {
        this.Employee_ID = Employee_ID;
        this.Employee_Name = Employee_Name;
        this.Employee_Sex = Employee_Sex;
        this.Employee_PhoneNo = Employee_PhoneNo;
    }
            
     public void Add_Participant()
     {
         
     }
     public void Remove_Participant()
     {
         
     }
     public void Add_Volunteer()
     {
         
     }
     public void Remove_Volunteer()
     {
         
     }
     public String tostring()
     {
         return "Employee ID" +  this.Employee_ID + "Employee Name " + this.Employee_Name + "Employee Sex" + this.Employee_Sex + "Employee PhoneNo" + this.Employee_PhoneNo;
     }
}
