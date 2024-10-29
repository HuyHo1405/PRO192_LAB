package part_2_2;

import java.util.Scanner;

public class Part_2_2 {

    public static void main(String[] args) {
        //declaration
        Part_2_2 obj = new Part_2_2();
        boolean condition = true;
        String s = "";

        //input a string match pattern
        while (condition) {
            try {
                condition = false;
                s = obj.inputString();
            } catch (Exception e) {
                System.out.println("The string is invalid\n");
                condition = true;
            }
        }

        //display result
        System.out.println("The string is " + s);
    }

    public String inputString() throws Exception {
        //declaration
        String s;
        String pattern = "SE\\d{3}";
        Scanner sc = new Scanner(System.in);

        //scanner - input a string
        System.out.print("Input the string 1: ");
        s = sc.nextLine();

        //check if not match pattern
        if (!s.matches(pattern)) {
            throw new Exception();
        }

        //return result
        return s;
    }
}
