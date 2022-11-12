/*. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido.
 */
package ejericicosaprendizajes;


import java.util.Scanner;



/**
 *
 * @author matias
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
        int num, cont=0, buscar;
        
        System.out.println("ingrese un numero de tamaño");
        num=leer.nextInt();
        
        int vector[] = new int[num];
         System.out.println("ingrese un numero a buscar ");
         buscar=leer.nextInt();
         
        for (int i = 0; i < num; i++) {
            
            vector[i]=(int) (Math.random()*20+1);
            
            System.out.println("Vector "+ i + " --> " + vector[i]);
            
           
        
               
               
           }
        for (int i = 0; i < num; i++) {
               if (buscar == vector [i]){
               cont++;
               System.out.println("el numero se encuentra en la posicion " + i);
            
        }
        
        }
        
     
            
            }
        }
     
     
    
    

