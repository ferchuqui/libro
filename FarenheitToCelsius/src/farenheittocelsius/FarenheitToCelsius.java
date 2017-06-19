/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farenheittocelsius;
import java.util.Scanner;
/**
 *
 * @author ferchuqui
 * based on Introduction to Java 8th Edition
 * 2.5 Farenheit to Celsius
 */
public class FarenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celsius = (5.0/9)*(fahrenheit -32);
        System.out.println("Farenheit " + fahrenheit + " is " +
                        celsius + " in Celsius");
        
    }
    
}
