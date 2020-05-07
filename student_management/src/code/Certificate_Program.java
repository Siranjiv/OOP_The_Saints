/*
Name: K.Lavan lucas
NO : IT19781792
 */
package code;

/**
 *
 * @author User
 */
public class Certificate_Program {

    public String ProgramName;
    public Float ProgramFees;
    public String Duration;
    public String StartDate;
    public String EndDate;
    public Integer Enrolment_Limit;

    public Certificate_Program(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    public Float getProgramFees() {
        return ProgramFees;
    }
    
    
    
}
