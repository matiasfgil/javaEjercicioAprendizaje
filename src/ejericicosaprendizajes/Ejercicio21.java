/*Dadas dos matrices cuadradas de nÃºmeros enteros, 
la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual 
se compruebe si la matriz P estÃ¡ contenida
dentro de la matriz M. Para ello se debe verificar
si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazÃ¡ndose por 
filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el 
programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento
de la submatriz P
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio21 {

 static Scanner leer = new Scanner (System.in);
 
    public static void main(String[] args) {
        
        int [][] MatrizP= new int [10][10];
        int [][] Matriz= new int [3][3];
        
        System.out.println("Ingrese numero a la matriz principal del 10 x 10");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MatrizP[i][j]=(int) (Math.random()*10);
            }
        }
      
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("["+MatrizP[i][j]+"]" );
            }
            System.out.println("");
        }
        
        System.out.println("ingrese la matriz a buscar de 3 x 3 ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("FILA " + i + " COLUMNA " + j);
                Matriz[i][j]=leer.nextInt();
            }
        }
        Busqueda(MatrizP, Matriz);
    }
   public static void Busqueda (int[][]matrizP,int[][]matriz){
       int fila=0;
       int columna=0;
       int coincidencia=0;
       
       for (int i = 0; i < 8; i++) {
           for (int j = 0; j < 8; j++) {
               if (matrizP[i][j]==matriz[0][0]) {
                   for (int k = i; k < (i+3); k++) {
                       for (int l = j; l < (j+3); l++) {
                           if (matrizP[k][l]==matriz[k-i][l-j]) {
                               fila=i;
                                columna=j;
                                coincidencia+=1;
                           }
                       }
                   }
               }
               if (coincidencia>0) {
                   System.out.println("La matriz principal contiene a la matriz secundaria");
                   System.out.println("Se encuentra ubicada en: ");
                   for (int m = fila; m < fila-3; m++) {
                       for (int n = columna; n < columna-3; n++) {
                            System.out.print("[" + m + "," + n + "]");
                       }
                       System.out.println("");
                   }
               }
           }
           
       }
       
   }
}
