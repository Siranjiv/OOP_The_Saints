package Models;

public class Student {
    public String Student_ID;
    public String  Student_Name; 
    public int Student_Age;
    public String Student_Sex;
    public int Student_PhoneNo;
    
    public Student(String Student_ID, String Student_Name, int Student_Age, String Student_Sex, int Student_PhoneNo)
    {
        this.Student_ID = Student_ID;
        this.Student_Name = Student_Name;
        this.Student_Age = Student_Age;
        this.Student_Sex = Student_Sex;
        this.Student_PhoneNo = Student_PhoneNo;
    }
    
   public void Add_Details()
   {
       
   }
   public String tostring()
   {
       return "Student_ID" + this.Student_ID + "Student_Name" + this.Student_Name + "Student_Age" + this.Student_Age + "Student_Sex" + this.Student_Sex + "Student_PhoneNo" + this.Student_PhoneNo; 
   }
}
