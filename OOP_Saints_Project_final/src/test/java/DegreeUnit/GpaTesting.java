
package DegreeUnit;

import Models.Degree;
import org.junit.jupiter.api.*;




public class GpaTesting {
    private static Degree l =new Degree();
    private static Degree.GPA gpa;
    //Degree.GPA gpa =l.new GPA();
    Degree.manageCourse co;
    public double gpaanswer;
    @BeforeAll
    public static void CreateGPA()
    {
       gpa =l.new GPA(4,2,13);
        
    }
    @BeforeEach
    public void SetDetails()
    {
    gpaanswer=gpa.CalculateGPA(4,2);
    
    }
    @Test
    public void TestGPA()
    {
    
    Assertions.assertEquals(8, gpaanswer);
    }
    @AfterEach
    public void ClearData()
    {
    gpaanswer=0;
    }
    @AfterAll
    public static void DeleteRider()
    {
        gpa=null;
    }
    
}
