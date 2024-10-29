


public class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBreak;

    //constructors
    public Car() {
    }

    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBreak) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBreak = ParkingBreak;
    }
    
    //getters
    public String getColour() {
        return Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public boolean isParkingBreak() {
        return ParkingBreak;
    }
    
    //setters
    public void setColour(String Color) {
        this.Colour = Color;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBreak(boolean ParkingBreak) {
        this.ParkingBreak = ParkingBreak;
    }
    
    //toString
    @Override
    public String toString(){
        return "Colour:" + Colour + "\nEnginePower:" + EnginePower + "\nConvertible:" + Convertible + "\nParkingBreak:" + ParkingBreak;
    }

    //other logic methods
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }
    
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the accelerator button");
    }
    
    public void output(){
        System.out.println(toString());
    }

    
    
}
