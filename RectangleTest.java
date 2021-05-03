package hwweek6assign2;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {
        // TODO code application logic here

        Rectangle rectangle = new Rectangle(1, 1);//create rectangle object with dimensions defaulting to 1
        Scanner scanner = new Scanner(System.in);//create scanner object to collect user input

        System.out.println("Jonathan Poole – D03 - Assignment 6.2\n"); //user info

        int userInput = 0; //navigate menu
        double userValue = 0; //choose new length/width value
        while (userInput != 3) { //loop through menu options and Exit on 3
            System.out.println("");
            System.out.println("1. Set Length");
            System.out.println("2. Set Width");
            System.out.println("3. Exit");
            System.out.println("Choice: ");
            //collect user input
            userInput = scanner.nextInt();
            if (userInput == 1) {  //if user chooses 1 then update length
                System.out.println("Please select a new Length value larger than 0 and less than 20");
                //set new rectangle length and try to catch exceptions
                try {
                    rectangle.setLength(userValue = scanner.nextFloat());
                } catch (IllegalArgumentException e) {
                    System.out.printf("Exception: %s%n%n", e.getMessage());
                }
                System.out.println("Length is " + rectangle.getLength());
            }
            if (userInput == 2) {  //if user chooses 2 then update width
                System.out.println("Please select a new Width value larger than 0 and less than 20");
                //set new rectanghle width and try to catch exceptions
                try {
                    rectangle.setWidth(userValue = scanner.nextFloat());
                } catch (IllegalArgumentException e) {
                    System.out.printf("Exception: %s%n%n", e.getMessage());
                }
                System.out.println("Width is " + rectangle.getWidth());
            }
        }

        System.out.println("Length is " + rectangle.getLength());
        System.out.println("Width is " + rectangle.getWidth());
        System.out.println("Area is: " + rectangle.calculateArea());
        System.out.println("Perimeter is: " + rectangle.calculatePerimeter());
    }
}
