package DOT;


public abstract class Organization {
    //template
    protected int size;

    //default constructor
    public Organization() {
    }

    //constructor
    public Organization(int size) {
        this.size = size;
    }

    //getter & setter
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    //abstract method
    public abstract void communicateByTool();

    //toString
    @Override
    public String toString() {
        return "the organization’s size is" + size;
    }
    
    
}
