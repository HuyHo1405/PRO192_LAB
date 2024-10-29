package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        //declaration
        Item item = null;
        int choice;
        Scanner sc;

        do {
            //print the menu
            System.out.println("1. Create a vase:");
            System.out.println("2. Create a statue:");
            System.out.println("3. Create a painting:");
            System.out.println("4. Display the item:");
            System.out.print("Input a choice:");

            //get choice
            sc = new Scanner(System.in);
            choice = sc.nextInt();
            System.out.println("");

            //switch case choice
            switch (choice) {
                case 1: //create new vase 
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;

                case 2://create new statue
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;

                case 3://create new painting
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;

                case 4://item output
                    if (item instanceof Vase) {
                        ((Vase) item).outputVase();
                    } else if (item instanceof Statue) {
                        ((Statue) item).outputStatue();
                    } else if (item instanceof Painting) {
                        ((Painting) item).outputPainting();
                    } else {
                        System.out.println("You need to creat an object");
                    }
                    break;
            }
            System.out.println("");
        } while (choice <= 4);//break when input greater than 4

    }
}
