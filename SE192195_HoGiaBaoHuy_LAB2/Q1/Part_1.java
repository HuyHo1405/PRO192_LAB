package part_1;

import java.util.Scanner;

public class Part_1 {

    public static void main(String[] args) {
        //declaration
        Scanner sc;
        int num = 0;
        boolean condition = true;
        
        //input an integer > 1
        while (condition) {
            try {
                //input integer
                condition = false;//assume best attempt
                System.out.print("Enter the number: ");
                sc = new Scanner(System.in);
                num = sc.nextInt();
                
                //check if < 1
                if (num < 1) {
                    condition = true;
                    System.out.println("The number is invalid\n");
                }

            } catch (Exception e) {
                condition = true;//force input again
                System.out.println("The number is invalid]\n");
            }
        }
        
        //display result
        System.out.println("The number is : " + num);
    }

}
