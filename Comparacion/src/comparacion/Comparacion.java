/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacion;
import java.util.Scanner
/**
 *
 * @author ferchuqui
 */
public class Comparacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1; //primer numero a comparar
        int numero2; //segundo numero a comparar
        
        System.out.print("Escriba el primer entero: "); //indicador
        numero1 = entrada.nextInt(); //lee el primer numero
        
        System.out.print("Escriba el segundo numero: "); //indicador
        numero2 = entrada.nextInt();//lee el segundo numero
                
        if ( numero1 == numero2)
            System.out.printf( "%d == %d\n", numero1, numero2);
        if ( numero1 != numero2)
            System.out.printf( "%d != %d\n", numero1, numero2);
        if ( numero1 < numero2)
            System.out.printf( "%d < %d\n", numero1, numero2);
        if ( numero1 > numero2)
            System.out.printf( "%d > %d\n", numero1, numero2);
        if ( numero1 <= numero2)
            System.out.printf( "%d <= %d\n", numero1, numero2);
        if ( numero1 >= numero2)
            System.out.printf( "%d >= %d\n", numero1, numero2);
        
    }//fin del metodo main
    
}//fin de la clase comparacion
