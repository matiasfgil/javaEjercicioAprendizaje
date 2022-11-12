/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa).
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio18 {
    
static Scanner leer = new Scanner (System.in);

    public static void main(String[] args) {
        int[][] matriz =new int[4][4];
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                
                matriz[f][c]=(int) (Math.random()*10);
                System.out.print("["+ matriz[f][c]+ "]");
                
            }
            System.out.println("");
            
        }
            System.out.println("-----------------");
        //traspodiendo la matriz
       
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                
                 System.out.print("["+matriz[c][f]+"]");
            }
           
                System.out.println("");
               
        }
        
                
                 
            }
           
        }
    
    

