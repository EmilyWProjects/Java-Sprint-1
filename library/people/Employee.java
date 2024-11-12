package library.people;

public class Employee extends Patron{


    public Employee(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }


    public String getPatronType(){
        return "Employee";
    }
    
    
}
