package DTO;

import java.util.Scanner;

public class Painting extends Item {

    //template
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    //default constructor
    public Painting() {
    }

    //constructor
    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);//father variables
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    //getters & setters
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
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
    public void inputPainting() {
        //declaration
        Scanner sc;
        boolean condition;

        //
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

        //input for width
        do {
            try {
                System.out.print("Please enter the width value (w > 0): ");
                sc = new Scanner(System.in);
                this.width = sc.nextInt();
                if (!(width > 0)) {
                    throw new Exception("The width value must be greater than 0!");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input value! Please re-do.");
            }
        } while (true);

        //input for isWatercolour
        do {
            try {
                System.out.print("Please enter if the painting is water coloured [Y/N]: ");
                sc = new Scanner(System.in);
                switch (sc.nextLine().charAt(0)) {
                    case 'y':
                    case 'Y':
                        this.isWatercolour = true;
                        break;
                    case 'n':
                    case 'N':
                        this.isWatercolour = false;
                        break;
                    default:
                        throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input value! Please re-do.");
            }
        } while (true);

        //input for isFramed
        do {
            try {
                System.out.print("Please enter if the painting is framed [Y/N]: ");
                sc = new Scanner(System.in);
                switch (sc.nextLine().charAt(0)) {
                    case 'y':
                    case 'Y':
                        this.isFramed = true;
                        break;
                    case 'n':
                    case 'N':
                        this.isFramed = false;
                        break;
                    default:
                        throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input value! Please re-do.");
            }
        } while (true);
    }

    ///output
    public void outputPainting() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("IsWatercolour: " + isWatercolour);
        System.out.println("IsFramed: " + isFramed);
    }

}
