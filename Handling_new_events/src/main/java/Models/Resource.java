package Models;

public class Resource {
    public String Machine_ID; 
    public String Machine_Type; 
    public String Hired_date;
    public String Return_Date;
    public String Borrowed_By;
    
    public Resource (String Machine_ID, String Machine_Type, String Hired_date, String Return_Date, String Borrowed_By)
    {
        this.Machine_ID = Machine_ID;
        this.Machine_Type = Machine_Type;
        this.Hired_date = Hired_date;
        this.Return_Date = Return_Date;
        this.Borrowed_By = Borrowed_By;
    }
    
    public String tostring()
    {
        return "Machine_ID" + this.Machine_ID + "Machine_Type" + this.Machine_Type + "Hired_date" + this.Hired_date + "Return_Date" + this.Return_Date + "Borrowed_By" + this.Borrowed_By;
    }
}
