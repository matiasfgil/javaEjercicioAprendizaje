/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas..
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Eercicio1 {
    
static Scanner leer = new Scanner (System.in);

    public static void main(String[] args) {
        
        int min , horas = 1, dias = 1, dias_horas;
        
        System.out.println("ingrese la cantidad de minutos a convertit");
        min=leer.nextInt();
        
        dias_horas=CalcularDiasHoras(dias, horas, min);
        
         System.out.println("el equivalente de min a dias y hora es "+ dias_horas);
    }
    public static int CalcularDiasHoras(int dias , int horas, int min) {
        
        int dias_horas = 0;
        
        dias_horas += horas *60;
        dias_horas+= dias * 24 *60;
        
        return dias_horas;
    
    }
}

