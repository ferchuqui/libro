/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayingtime;
import java.util.Scanner;

/**
 *
 * @author ferchuqui
 *  * based on Introduction to Java 8th Edition
 * 2.4 Displaying time in Java
 */
public class DisplayingTime {

    /**
     * @paramc args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user for the input
        System.out.print("Enter a integer for seconds: ");
        int seconds = input.nextInt();
        int minutes = seconds /60; // Find minutes in seconds
        int remainingSeconds = seconds % 60; //Seconds remaining
        System.out.println( seconds + " seconds is " + minutes + 
                " minutes and " + remainingSeconds + "seconds");
        
    
    }
    
}
