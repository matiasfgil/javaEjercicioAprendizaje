/*Crear un programa que dado un numero determine si es par o impar.
 * 
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num=0;
       
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
       
        if (num%2 == 0) {
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
       
    }
    
}
