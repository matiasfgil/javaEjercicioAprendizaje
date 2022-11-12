/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * 
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double f, c;
        
        System.out.println("Ingrese la cantidad de grados Centigrados a convertir");
        c=leer.nextDouble();
        
        f= 9/5.0 *c +32;
        
        System.out.println(c + " grados centigrados equivalen a " + f + " grados Fahrenheit");
        
        
        
    }
    
}
