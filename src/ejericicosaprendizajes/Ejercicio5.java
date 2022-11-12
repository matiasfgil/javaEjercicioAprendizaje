/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * 
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        
        int numero, raiz;
        
        System.out.println("Ingrese un numero");
        numero=leer.nextInt();
        
        System.out.println("el doble de "+numero+ " es "+2*numero);
        System.out.println("el triple de "+numero+" es "+3*numero);
        
        raiz=(int)Math.sqrt(numero);
        
        System.out.println("la raiz cuadrada de"+numero+ " es "+raiz);
        
        
    }
    
}
