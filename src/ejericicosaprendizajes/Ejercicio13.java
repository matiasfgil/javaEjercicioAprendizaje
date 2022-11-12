/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
package ejericicosaprendizajes;
import java.util.Scanner;

public class Ejercicio13 {
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de elementos del cuadrado: ");
        int elements = leer.nextInt();
        for(int i=0; i<elements;i++){
            for(int j=0; j<elements;j++)
            {
                if(i==0 || i == elements-1 || j==0 || j == elements-1){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
            
        }
        
    }
    
}
