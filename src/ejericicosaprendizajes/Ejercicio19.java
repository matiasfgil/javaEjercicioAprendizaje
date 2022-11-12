/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio19 {
    
static Scanner leer = new Scanner (System.in);

    public static void main(String[] args) {
        int Dimension = 3;
        int[][] Matriz;
        Matriz = new int[Dimension][Dimension];
        Matriz[0][0] = 0;
        Matriz[0][1] = -2;
        Matriz[0][2] = 4;
        Matriz[1][0] = 2;
        Matriz[1][1] = 0;
        Matriz[1][2] = 2;
        Matriz[2][0] = -4;
        Matriz[2][1] = -2;
        Matriz[2][2] = 0;
        
        for (int i = 0; i < Dimension; i++) {
            for (int j = 0; j < Dimension; j++) {
                System.out.print("["+Matriz[i][j] + "]\t");
            }
            System.out.println("");
        }
        MatrizTranspuesta(Matriz, Dimension);
        System.out.println("Matriz transupuesta y Negada");
        for (int i = 0; i < Dimension; i++) {
            for (int j = 0; j < Dimension; j++) {
                System.out.print("["+Matriz[i][j] + "]\t");
            }
            System.out.println("");
        }
    }
    public static void MatrizTranspuesta(int M[][], int D){

            int [][] Trans;
            Trans= new int [D][D];
         for (int i = 0; i < D; i++) {
            for (int j = 0; j < D; j++) {
                Trans[i][j]= M [j][i]*-1; 
               if (Trans[i][j]== M [j][i]*-1) {
                  
                    if (i==D-1 && j == D-1){
                     System.out.println("La matriz es antisimetrica");
                    }
               }
               else{
                   
                    if (i==D-1 && j == D-1){
                     System.out.println("La matriz no es antisimetrica");
                    }
                    
               }
            }       
        }
        
            
        
    } 
         
}
