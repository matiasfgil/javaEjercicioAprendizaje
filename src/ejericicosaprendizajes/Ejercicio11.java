/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int Opcion, Num1, Num2;
        
        System.out.println("Ingrese un numero para operar: ");
        Num1 = leer.nextInt();
        System.out.println("Ingrese otro numero para operar: ");
        Num2 = leer.nextInt();
        do{
            
        
            System.out.println("-----------------------------");
            System.out.println("1. Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
            System.out.println("-----------------------------");
        
            System.out.println("Ingrese un numero de zona a la que quiera dirigirse: ");
            Opcion = leer.nextInt();
        
            switch(Opcion){
                case 1:
                    System.out.println("El resultado de "+ Num1 + " + " + Num2 + " es: " + Suma(Num1, Num2));
                    break;
                case 2:
                    System.out.println("El resultado de "+ Num1 + " - " + Num2 + " es: " + Resta(Num1, Num2));
                    break;
                case 3:
                    System.out.println("El resultado de "+ Num1 + " * " + Num2 + " es: " + Multiplicacion(Num1, Num2));
                    break;
                case 4:
                    System.out.println("El resultado de "+ Num1 + " / " + Num2 + " es: " + Division(Num1, Num2));
                    break;    
                case 5:
                    Opcion = Salir();
                    break;
        }
        }while(Opcion != 5);
        System.out.println("Gracias por usar nuestro programa!");
        
    }
    public static int Suma(int N1, int N2){
        int resultado;
        
        resultado = N1 + N2;
        
        return resultado;
    }
    public static int Resta(int N1, int N2){
        int resultado;
        
        resultado = N1 - N2;
        
        return resultado;
    }
    public static int Multiplicacion(int N1, int N2){
        int resultado;
        
        resultado = N1 * N2;
        
        return resultado;
    }
    public static float Division(int N1, int N2){
        float resultado;
        
        resultado = N1 / N2;
        
        return resultado;
    }
    public static int Salir(){
        Scanner leer = new Scanner(System.in);
        int Decision;
        
        System.out.println("Ingrese:\n1.Salir\n2.Volver al menu\n-->");
        Decision = leer.nextInt();
        if(Decision == 1){
            return 5;
        }
        else{
            return 0;
        }
        
        
    }
    }



