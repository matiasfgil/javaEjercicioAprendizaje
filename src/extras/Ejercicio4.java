/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio4 {

  static Scanner leer = new Scanner(System.in);
   
    public static void main(String[] args) {
        int num;
       
        System.out.println("ingrese un numero del 1 al 10");
        num=leer.nextInt();
        
        
        
        switch (num) {
            case 1:
                System.out.println( num + "  equivale a I " );
                break;
            case 2:
                System.out.println( num + " equivale a II " );
                break;
            case 3:
                System.out.println( num + " equivale a III " );
                break;
            case 4:
                System.out.println( num + "  equivale a IV " );
                break;
             case 5:
                System.out.println( num + "  equivale a V " );
                break;
            case 6:
                System.out.println( num+ "  equivale a VI ");
                break;
            case 7:
                System.out.println( num + "  equivale a VII " );
                break;
            case 8:
                System.out.println( num + "  equivale a VIII " );
                break;
            case 9:
                System.out.println( num + " equivale a IV " );
                break;
            case 10:
                System.out.println(num + " equivale a X " );
                break;
            default:
               
            
                
        }
    
        
}
}