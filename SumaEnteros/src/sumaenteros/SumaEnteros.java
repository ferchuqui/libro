/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaenteros;
import java.util.Scanner;
/**
 *
 * @author ferchuqui
 * Este programa tiene como objetivo la suma de dos enteros con ingreso
 * de datos, utiliza la clase scanner
 * Basado en Como programar en Java - Deitel
 */
public class SumaEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crea objeto scanner para obtener la entrada de datos
        Scanner entrada = new Scanner(System.in);
        
        
        int numero1;//primer numero a sumar
        int numero2;//segundo numero a sumar
        int suma;//suma de numero1 y numero2
        
        System.out.print( "Escriba el primer entero: ");//indicador
        numero1 = entrada.nextInt(); //lee el primer numero del usuario
        System.out.print( "Escriba el segundo entero: ");//indicador
        numero2 = entrada.nextInt(); //lee el primer numero del usuario
        suma = numero1 + numero2;
        System.out.printf("La suma es %d\n",suma); //muestra la suma
        
//fin del metodo main
        //fin de la clase suma
    }
    
}
