/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeaverage;
import java.util.Scanner;

/**
 *
 * @author ferchuqui
 * * based on Introduction to Java 8th Edition
 */
public class Computeaverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        //Prompt the user to enter three numbers
                System.out.print("Enter three numbers: ");
                double number1 = input.nextDouble();
                double number2 = input.nextDouble();
                double number3 = input.nextDouble();
                
                //Compute average 
                double average = (number1 + number2 + number3)/3;
                
                //Display result
                System.out.println();
                System.out.println("The average of " + number1 + " " +
                        number2 + " " + number3 + "is " + average);
    }
    
}
