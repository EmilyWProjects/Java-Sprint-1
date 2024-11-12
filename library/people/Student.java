package library.people;
public class Student extends Patron{


    public Student(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }


    public String getPatronType(){
        return "Student";
    }
    
    
}
