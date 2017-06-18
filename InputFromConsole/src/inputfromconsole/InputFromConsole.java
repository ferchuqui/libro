/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputfromconsole;
import java.util.Scanner; //Scanner is in the Java Util Package
/**
 *
 * @author ferchuqui
 */
public class InputFromConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter a radius
        System.out.print ("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        //Compute area
        double area = radius * radius * 3.14159;
        //display result
        System.out.println("The area for the circle of radious " +
                radius + " is " + area);
        
    }
    
}
