package DOT;


import DOT.University;


public class FPTUniversity extends University implements Role{
    //template
    String address;

    //default constructor
    public FPTUniversity() {
    }

    //constructor
    public FPTUniversity(int size, String name, String address) {
        super(size, name);
        this.address = address;
    }

    //getter & setter
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //toString
    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }

    //implementation
    @Override
    public void createWorker() {
        System.out.println("providing human resources");
    }
    
    
}
