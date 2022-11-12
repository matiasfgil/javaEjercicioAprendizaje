/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

 */
package extras;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio3 {

static Scanner leer = new Scanner (System.in);

    public static void main(String[] args) {
       char vocal;
        
        System.out.println("Ingrese un caracter");
        vocal=leer.next().charAt(0);
        
        switch (vocal) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("La letra ingresada es una vocal");
               
                break;
                default:
                    System.out.println("El caracter ingresado no es una vocal");
                    break;
                
               
        }
        
       
    }
    
}
