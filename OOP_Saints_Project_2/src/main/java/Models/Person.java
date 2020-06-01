
package Models;

public class Person {

    public String name;
    public String phoneNo;
    public int age;
    private String address;
    public String Gender;
    
    
    public Person(String name,String phoneNo,int age,String address,String Gender)
    {
            this.name=name;
            this.phoneNo=phoneNo;
            this.age=age;
            this.address=address;
            this.Gender=Gender;
    
    }
    
    public void printPersonDetails()
    {
        System.out.println("Name"+name);
        System.out.println("Phone Number"+phoneNo);
        System.out.println("age"+age);
        System.out.println("address"+address);
        System.out.println("Gender"+Gender);
        
    
    }

}
