package part_2;

import java.util.Scanner;

public class Part_2 {

    public static void main(String[] args) {
        //declaration
        Scanner sc;
        String s = "";
        String pattern = "SE\\d{3}";
        boolean condition = true;

        //input a string match pattern
        while (condition) {
            try {
                //input string
                System.out.print("Input the string 1: ");
                condition = false;//assume best attempt
                sc = new Scanner(System.in);
                s = sc.nextLine();
                
                //check match pattern
                if (!s.matches(pattern)) {
                    throw new Exception();
                }
            } catch (Exception e) {
                condition = true;//force input again
                System.out.println("The string is invalid\n");
            }
        }
        
        //display result
        System.out.println("The string is: " + s);
    }

}
