package DTO;

import java.util.Scanner;

public class Vase extends Item {

    //template
    private int height;
    private String material;

    //default constructor
    public Vase() {
    }

    //constructor
    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    //getters & setters
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
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
    public void inputVase() {
        //declaration
        Scanner sc;

        //re-use
        super.input();

        //input for height
        do {
            try {
                System.out.print("Please enter the height value (h > 0): ");
                sc = new Scanner(System.in);
                this.height = sc.nextInt();
                if (!(height > 0)) {
                    throw new Exception("The height value must be greater than 0!");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input value! Please re-do.");
            }
        } while (true);

        //input for material
        do {
            try {
                System.out.print("Please enter input for the vase material: ");
                sc = new Scanner(System.in);
                this.material = sc.nextLine();
                if (material.trim().isEmpty()) {
                    throw new Exception("Materia; must not be emty!");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input value! Please re-do!");
            }
        } while (true);
    }

    ///output
    public void outputVase() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }

}
