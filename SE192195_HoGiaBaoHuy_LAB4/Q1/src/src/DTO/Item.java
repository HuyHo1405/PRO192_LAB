package DTO;

import java.util.Scanner;

public class Item {

    //template
    protected int value;
    protected String creator;

    //default constructor
    public Item() {
    }

    //constructor
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    //getters & setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    //behaviour
    ///input for default constructor
    public void input() {
        Scanner sc;

        //input for value
        do {
            try {
                System.out.print("Please enter input for the value (v > 0): ");
                sc = new Scanner(System.in);
                this.value = sc.nextInt();
                if (!(value > 0)) {
                    throw new Exception("The value must be greater than 0!");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input value! Please re-do!");
            }
        } while (true);

        //input for creator name
        do {
            try {
                System.out.print("Please enter input for the creator name: ");
                sc = new Scanner(System.in);
                this.creator = sc.nextLine();
                if (creator.trim().isEmpty()) {
                    throw new Exception("Creator name must not be emty!");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input value! Please re-do!");
            }
        } while (true);
    }

    ///output
    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
}
