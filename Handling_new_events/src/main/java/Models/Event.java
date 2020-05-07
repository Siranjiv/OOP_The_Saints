package Models;

public class Event {
    
    public String Name;
    public String EventID;
    public String Event_Manager;
    public float Cost;
    public String Start_Date;
    public String End_Date;
    public String Time;
    
    public Event(String Name, String EventID, String Event_Manager, float cost, String Start_date, String End_date, String Time)
    {
        this.Name = Name;
        this.EventID = EventID;
        this.Event_Manager = Event_Manager;
        this.Cost = cost;
        this.Start_Date = Start_date;
        this.End_Date = End_date;
        this.Time = Time;
    }
    
    @Override
    public String toString()
    {
        return "Name" + this.Name + "EventID" + this.EventID + "Event_Manager" + this.Event_Manager + "cost" + this.Cost + "Start_Date" + this.Start_Date + "End_date" + this.End_Date + "Time" + this.Time;
        
    }
}
