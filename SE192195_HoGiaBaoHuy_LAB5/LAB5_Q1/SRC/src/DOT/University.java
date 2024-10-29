package DOT;


import DOT.Organization;


public class University extends Organization {
    //template
    protected String name;

    //default constructor
    public University() {
    }

    //constructor
    public University(int size, String name) {
        super(size);
        this.name = name;
    }

    //implementation
    @Override
    public void communicateByTool() {
        System.out.println("in the university, people communicate by voice");
    }
    
    //behaviour
    public void enroll(){
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }
    
    public void educate(){
        System.out.println("provide education at university standard");
    }

    //toString
    @Override
    public String toString() {
        return "encourage the advancement and development of knowledge";
    }
    
    
}
