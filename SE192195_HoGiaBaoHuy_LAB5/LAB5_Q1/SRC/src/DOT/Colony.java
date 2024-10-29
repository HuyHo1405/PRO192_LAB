package DOT;


import DOT.Organization;


public class Colony extends Organization {
    //template
    protected String place;

    //default constructor
    public Colony() {
    }

    //constructor
    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }

    //behaviour
    @Override
    public void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }

    public void grow(){
        System.out.println("an annual cycle of growth that begins in spring");
    }
    
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }

    //toString
    @Override
    public String toString() {
        return "the colony size is" + size + 
                ", the colony’s place is" + place;
    }
    
    
}
