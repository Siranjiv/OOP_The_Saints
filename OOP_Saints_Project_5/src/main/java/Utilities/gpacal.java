
package Utilities;
import java.util.Scanner;

public class gpacal {
    
    

public static void main (String args[]){

  String grade = "";
  double credit1;
  double credit2;
  double credit3;
  double credit4;
  double gradeValue=0;
  double totPtsClass1=0;
  double totPtsClass2=0;
  double totPtsClass3=0;
  double totPtsClass4=0;
  double totPts=0;
  double totalCredits= 0;
  double gpa;

  Scanner console = new Scanner (System.in);
  System.out.println("Please enter the number of credits of the class 1 (A number)");
  credit1 = console.nextDouble();
  System.out.println("Please enter your grades for the class 1(Capital letters such as A,B+, C-)");
  grade = console.next();

  if (grade.equals ("A"))
    gradeValue= 4.00;
  else if (grade.equals("A-"))
    gradeValue= 3.67;
  else if (grade.equals("B+"))
    gradeValue = 3.33;
  else if (grade.equals("B"))
    gradeValue = 3.00;
  else if (grade.equals ("B-"))
    gradeValue = 2.67;
  else if (grade.equals("C+"))
    gradeValue = 2.33;
  else if (grade.equals("C"))
    gradeValue = 2.00;
  else if (grade.equals ("D+"))
  gradeValue = 1.33;
  else if (grade.equals ("D"))
    gradeValue = 1.00;
  else if (grade.equals ("F"))
    gradeValue = 0;
  else if (grade.equals ("FX"))
    gradeValue = 0;
  else
    System.out.println ("Invalid Grade");

  totPtsClass1 = gradeValue * credit1;

  System.out.println("Please enter the number of credits of the class 2 (A number)");
  credit2 = console.nextDouble();
  System.out.println("Please enter your grades for the class 2 (Capital letters such as A,B+, C-)");
  grade = console.next();

  if (grade.equals ("A"))
    gradeValue= 4.00;
  else if (grade.equals("A-"))
    gradeValue= 3.67;
  else if (grade.equals("B+"))
    gradeValue = 3.33;
  else if (grade.equals("B"))
    gradeValue = 3.00;
  else if (grade.equals ("B-"))
    gradeValue = 2.67;
  else if (grade.equals("C+"))
    gradeValue = 2.33;
  else if (grade.equals("C"))
    gradeValue = 2.00;
  else if (grade.equals ("D+"))
  gradeValue = 1.33;
  else if (grade.equals ("D"))
    gradeValue = 1.00;
  else if (grade.equals ("F"))
    gradeValue = 0;
  else if (grade.equals ("FX"))
    gradeValue = 0;
  else
  System.out.println ("Invalid Grade");

  totPtsClass2 = gradeValue * credit2;

  System.out.println("Please enter the number of credits of the class 3 (A number)");
  credit3 = console.nextDouble();
  System.out.println("Please enter your grades for the class 3 (Capital letters such as A,B+, C-)");
  grade = console.next();

  if (grade.equals ("A"))
    gradeValue= 4.00;
  else if (grade.equals("A-"))
    gradeValue= 3.67;
  else if (grade.equals("B+"))
    gradeValue = 3.33;
  else if (grade.equals("B"))
    gradeValue = 3.00;
  else if (grade.equals ("B-"))
    gradeValue = 2.67;
  else if (grade.equals("C+"))
    gradeValue = 2.33;
  else if (grade.equals("C"))
    gradeValue = 2.00;
  else if (grade.equals ("D+"))
  gradeValue = 1.33;
  else if (grade.equals ("D"))
    gradeValue = 1.00;
  else if (grade.equals ("F"))
    gradeValue = 0;
  else if (grade.equals ("FX"))
    gradeValue = 0;
  else
    System.out.println ("Invalid Grade");

    totPtsClass3 = gradeValue * credit3;

  System.out.println("Please enter the number of credits of the class 4 (A number)");
  credit4 = console.nextDouble();
  System.out.println("Please enter your grades for the class 4 (Capital letters such as A,B+, C-)");
  grade = console.next();

  if (grade.equals ("A"))
    gradeValue= 4.00;
  else if (grade.equals("A-"))
    gradeValue= 3.67;
  else if (grade.equals("B+"))
    gradeValue = 3.33;
  else if (grade.equals("B"))
    gradeValue = 3.00;
  else if (grade.equals ("B-"))
    gradeValue = 2.67;
  else if (grade.equals("C+"))
    gradeValue = 2.33;
  else if (grade.equals("C"))
    gradeValue = 2.00;
  else if (grade.equals ("D+"))
  gradeValue = 1.33;
  else if (grade.equals ("D"))
    gradeValue = 1.00;
  else if (grade.equals ("F"))
    gradeValue = 0;
  else if (grade.equals ("FX"))
    gradeValue = 0;
  else
    System.out.println ("Invalid Grade");
  totPtsClass4 = gradeValue * credit4;

  totPts= totPtsClass1+totPtsClass2+totPtsClass3+totPtsClass4;
  totalCredits = credit1+credit2+credit3+credit4;
  gpa= totPts / totalCredits;

  System.out.printf("Your GPA is: %.2f\n", + gpa);
}
}

