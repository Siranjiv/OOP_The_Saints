
package Models;


public class Degree {

    public String Course;
    public String Duration;
    public Float fee;
    public String intake;
    public Boolean U_degree;
       
    
    public Degree(String c,String D,Float f,String in,Boolean U_d)
    {
        Course=c;
        Duration=D;
        fee=f;
        intake=in;
        U_degree=U_d;
        
    }
    
    public Degree()
    {
        
    }
      public class manageCourse
    {
        int no_subjects;
        int credit;
        String subject_name;
        int total_credit_points; 
        
        public manageCourse(int no_sub,int total_credit)
        {
            no_subjects=no_sub;
            total_credit_points=total_credit;
        
        }
        public manageCourse(String sub_name,int cre)
        {
            subject_name=sub_name;
            credit=cre;
        
        }
        public manageCourse(int no_sub)
        {
            no_subjects=no_sub;
        }
    
    }
    

    
    public class GPA{ 
        
        float grade;
        float credit;
        int total_credit;
        
        public GPA(float g,float c,int tc)
        {
            grade=g;
            credit=c;
            total_credit=tc;
        }
        
        
        public GPA(float g,float c)
        {
            grade=g;
            credit=c;
        }
        public GPA()
        {
            
        }
 
    public float CalculateGPA(float grade,int credit)
    {
    float GPA;
    
    GPA=(grade*credit);
    return GPA;
    }
     public float CalculateWGPA(float grade,int credit,int total_credit)
    {
    float GPA;
    
    GPA=(grade*credit)/total_credit;
    return GPA;
    }     
    }
    


    
}



//    private double Examination()
//    {
//    
//    }
//    
       
//     
//    private void MarksDetails()
//    {
//    
//    
//    }
// 