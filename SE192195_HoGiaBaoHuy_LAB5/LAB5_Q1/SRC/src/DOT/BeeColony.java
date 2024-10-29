package DOT;


import DOT.Colony;


public class BeeColony extends Colony implements Role{
    //template
    String type;

    //default constructor
    public BeeColony() {
    }

    //constructor
    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }

    //getter & setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //toString
    @Override
    public String toString() {
        return "the colony’s type is " + type + 
                ", size is about " + size + 
                ", and the place is " + place;
    }

    //implementation
    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
    
    
    
}
