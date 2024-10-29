package DTO;

import java.util.Scanner;

public class Statue extends Item {

    //template
    private int weight;
    private String colour;

    //deafault constructor
    public Statue() {
    }

    //constructor
    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    //getters & setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColor(String colour) {
        this.colour = colour;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public void setCreator(String creator) {
        this.creator = creator;
    }

    //behaviour
    ///input for default constructor
    public void inputStatue() {
        //declaration
        Scanner sc;

        //re-use
        super.input();

        //input for weight
        do {
            try {
                System.out.print("Please enter the weight value (w > 0): ");
                sc = new Scanner(System.in);
                this.weight = sc.nextInt();
                if (!(weight > 0)) {
                    throw new Exception("The weight value must be greater than 0!");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input value! Please re-do.");
            }
        } while (true);

        //input for colour
        do {
            try {
                System.out.print("Please enter input for the statue colour: ");
                sc = new Scanner(System.in);
                this.colour = sc.nextLine();
                if (colour.trim().isEmpty()) {
                    throw new Exception("Colour must not be emty!");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input value! Please re-do!");
            }
        } while (true);

    }

    ///output
    public void outputStatue() {
        super.output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

}
