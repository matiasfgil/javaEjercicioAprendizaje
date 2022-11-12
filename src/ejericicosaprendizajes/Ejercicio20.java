/* Un cuadrado mÃ¡gico 3 x 3 es una matriz 3 x 3 formada por nÃºmeros del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idÃ©nticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mÃ¡gico o no.
El programa deberÃ¡ comprobar que los nÃºmeros introducidos son correctos, es decir,
estÃ¡n entre el 1 y el 9.
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio20 {

    static Scanner leer = new Scanner (System.in);
    
    public static void main(String[] args) {
       
        int [][] matrizMagica = new int[3][3];
        
        System.out.println("Ingrese un numero del 1 al 9 para llenar la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizMagica[i][j]=leer.nextInt();
                
            }
            
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matrizMagica[i][j]+"]" );
                
                
            }
                System.out.println("");
        }
        verificarMatriz(matrizMagica);
    }
    
     static void verificarMatriz (int [][] matrizMagica){
         int sumaF1=0, sumaF2=0, sumaF3=0, sumaC1=0, sumaC2=0, sumaC3=0, sumaD1=0, sumaD2=0;
         
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if (i==0) {
                     sumaF1=sumaF1+matrizMagica[i][j];
                 }
                 if (i==1) {
                     sumaF2=sumaF2+matrizMagica[i][j];
                 }
                 if (i==2) {
                     sumaF3=sumaF3+matrizMagica[i][j];
                 }
                 if (i==j) {
                     sumaD1=sumaD1+matrizMagica[i][j];
                 }
                 if (i+j==3-1) {
                     sumaD2=sumaD2+matrizMagica[i][j];
                 }
                 
             }
             
         }
         System.out.println(" ");
         sumaC1=matrizMagica[0][0]+matrizMagica[1][0]+matrizMagica[2][0];
         sumaC2=matrizMagica[0][1]+matrizMagica[1][1]+matrizMagica[2][1];
         sumaC3=matrizMagica[0][2]+matrizMagica[1][2]+matrizMagica[2][2];
         //suma diagonales
         
         if (sumaF1==sumaF2 && sumaF2==sumaF3 && sumaF1==sumaF3 && sumaC1==sumaC2 && sumaC2==sumaC3 && sumaC1==sumaC3 && sumaD1==sumaD2) {
             System.out.println("La Matriz es magica");
             
         }
         else {
             System.out.println("la matriz no es magica");
         }
     }
}
