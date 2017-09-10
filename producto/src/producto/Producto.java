/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;
//Ejemplo 2.6 Producto.java
//Calcular el producto de tres enteros.
import java.util.Scanner; // el programa usa Scanner
/**
 *
 * @author ferchuqui
 */
public class Producto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int x; //primer numero introducido por el usuario
        int y; //Segundo numero introducido por el usuario
        int z; //tercer numero introducido por el usuario
        int resultado; //producto de los numeros
        
        System.out.print("Escriba el primer entero:");
        x = entrada.nextInt();
        System.out.print("Escriba el primer entero:");
        y = entrada.nextInt();
        System.out.print("Escriba el primer entero:");
        z = entrada.nextInt();
        
                
        resultado = x * y * z; //calcula el producto de los numeros
        System.out.printf("El producto es %d\n", resultado);
    }
    
}
