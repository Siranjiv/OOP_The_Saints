package Models;

public class Lecturer extends Person {

    private float Salary;
    public String LID;
    public String Position;
    public String Qualiﬁcation;
    public String emailID;
    public String Subject;

    public Lecturer(String na, String pNo, int a, String add, String Gen, float Salary, String LID, String Position, String Qualiﬁcation, String emailID, String Subject) {
        super(na, pNo, a, add, Gen);
        this.Salary = Salary;
        this.LID = LID;
        this.Position = Position;
        this.Qualiﬁcation = Qualiﬁcation;
        this.emailID = emailID;
        this.Subject = Subject;

    }

    public Lecturer(String na, String pNo, int a, String Gen, String LID, String Position, String Qualiﬁcation, String emailID, String Subject) {
        super(na, pNo, a, Gen);
        this.LID = LID;
        this.Position = Position;
        this.Qualiﬁcation = Qualiﬁcation;
        this.emailID = emailID;
        this.Subject = Subject;

    }

    public Lecturer(String LID) {

        this.LID = LID;

    }

    public void teach() {

    }

    public void Supervise() {

    }

    private float Mark_Exam() {

    }

    private void Prepare_Examination() {

    }

    @Override
    public void printPersonDetails() {
        super.printPersonDetails();

        System.out.println("Lecturer ID" + LID);
        System.out.println("Lecturer Position" + Position);
        System.out.println("Lecturer Qualification" + Qualiﬁcation);
        System.out.println("Lecturer email" + emailID);

    }

}
