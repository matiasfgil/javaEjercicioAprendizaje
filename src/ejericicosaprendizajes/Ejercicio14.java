/*Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Moneda;
        float Cantidad;
        
        System.out.println("Ingrese la cantidad de euros que quiera convertir: ");
        Cantidad = leer.nextInt();
        
        do{
        System.out.println("Ingrese a la moneda que quiera cambiar: ");
        Moneda = leer.next();
        Moneda = Moneda.toUpperCase();
        }while(!Moneda.equals("LIBRA") && !Moneda.equals("DOLAR") && !Moneda.equals("YEN"));
        Menu(Cantidad, Moneda);
    }
     public static void Menu(float N, String M){
        switch(M){
            case "LIBRA":
                libras(N);
                break;
            case "DOLAR":
                dolares(N);
                break;
            case "YEN":
                yenes(N);
                break;    
        }
    }
      public static void libras(float N){
        float Convertido;
        
        Convertido = N * 0.86f;
        System.out.println("El valor en libras es: " + Convertido);
        
     }
     
      public static void dolares(float N){
       float Convertido;
       
       Convertido = N * 1.28611f;
       System.out.println("El valor en dolares es: " + Convertido);
    
      }
      
      public static void yenes(float N){
        float Convertido;
        
        Convertido = N * 129.852f;
        System.out.println("El valor en yenes es: " + Convertido);
      }
}
