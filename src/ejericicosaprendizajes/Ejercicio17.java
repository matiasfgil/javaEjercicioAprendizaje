/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio17 {

   static Scanner leer = new Scanner (System.in);

    public static void main(String[] args) {
        
        int num, largo;
        String Str;
        
        System.out.println("Ingrese la cantidad de numeros");
        num=leer.nextInt();
        
        int[] Enteros;
        Enteros= new int [num];
        
        for (int i = 0; i < num; i++) {
            do {
                System.out.println("ingrese un numero de hasta 5 digitos");
                Enteros[i]=leer.nextInt();
                Str=String.valueOf(Enteros[i]);
                largo=Str.length();
                
            } while (largo>5);
        }
        
        Cantidad_cifras(Enteros, num);
        
        
    }
    
    public static void Cantidad_cifras(int Enteros[],int num){
        int  Contador1=0, Contador2=0, Contador3=0, Contador4=0, Contador5=0;
        String Str;
        
        for (int i = 0; i < num; i++) {
           Str=String.valueOf(Enteros[i]);
           switch(Str.length()){
               case 1:
                   Contador1 ++;
                   break;
               case 2:
                   Contador2 ++;
                   break;
               case 3:
                   Contador3 ++;
                   break;
               case 4:
                   Contador4 ++;
                   break;
               case 5:
                   Contador5 ++;
                   break;
           }
            
        }
        System.out.println(" C A N T I D A D  D E  E L E M E N T O S");
        System.out.println("======================================\n");
        System.out.println("1 cifras: " + Contador1);
        System.out.println("======================================\n");
        System.out.println("2 cifras: " + Contador2);
        System.out.println("======================================\n");
        System.out.println("3 cifras: " + Contador3);
        System.out.println("======================================\n");
        System.out.println("4 cifras: " + Contador4);
        System.out.println("======================================\n");
        System.out.println("5 cifras: " + Contador5);
        System.out.println("======================================\n");
    }
    
    
}
