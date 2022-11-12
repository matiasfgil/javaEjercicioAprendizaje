/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer =new Scanner (System.in);
       
       String cadena;
       
        System.out.println("Ingrese una frase");
        cadena=leer.nextLine();
        
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
                
              
       
    }
    
}
