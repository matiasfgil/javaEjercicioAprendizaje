/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java.
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String cadena1;
       String frase;
       
       cadena1="eureka";
       
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        
         
        if (cadena1.equals(frase)) {
               System.out.println("correcto");
        
            
        }else{
            System.out.println("Incorrecto");
        }
        
       
    }
    
}
