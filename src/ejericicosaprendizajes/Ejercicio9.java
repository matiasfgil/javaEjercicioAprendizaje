/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que 
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
la función Substring y equals() de Java
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase , subcadena;
        int largo;
        
        System.out.println("ingrese una frase");
        frase=leer.nextLine();
        
        largo=frase.length();
        
        subcadena=frase.substring(0,1);
        
        if ("A".equals(subcadena)) {
            System.out.println("Correcto");
            
        }else{
            System.out.println("Incorrecto");
        }
 {
            
        }
 {
            
        }
        
    }
    
}
