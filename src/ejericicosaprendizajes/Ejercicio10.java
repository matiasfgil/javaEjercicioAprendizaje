/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int limite, num, sumador=0;
       
        System.out.println("Ingrese un numero positivo");
        limite=leer.nextInt();
        
       while (sumador<=limite) {
           System.out.println("Ingrese un numero a sumar");
           num=leer.nextInt();
           
           sumador +=num;
           
           
            
        }
       System.out.println("limite " + limite + " la suma fue " + sumador);
    }
    
}
