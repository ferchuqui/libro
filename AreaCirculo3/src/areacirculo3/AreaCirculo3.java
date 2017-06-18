/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirculo3;

/**
 *
 * @author ferchuqui
 * based on Introduction to Java 8th Edition 
 */
public class AreaCirculo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Define variables
        double radius;
        double area;
        
        // Asign a radius
        radius = 20; //New value in radius
        // Compute area
        area = radius * radius * 3.1415927;
        //Display results
        System.out.println("The area of circle of radius" + 
                radius + " is " + area );
                
    }
    
}
