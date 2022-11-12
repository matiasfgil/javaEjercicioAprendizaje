/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicosaprendizajes;

import java.util.Scanner;

/**
 *
 * @author matias
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer =new Scanner (System.in);
       String frase, s_letter, f_letter;
        int correct=0, incorrect=0;
        do{
            System.out.println("Ingrese cadena: ");
            frase = leer.nextLine();
            s_letter = frase.substring(0,1);
            f_letter = frase.substring(frase.length()-1,frase.length());
            if(frase.length()<=5 && (s_letter.toUpperCase().equals("X") && f_letter.toUpperCase().equals("O"))){
                System.out.println(" C O R R E C T O ");
                correct++;
            }else{
                if(frase.equals("&&&&&")){
                    System.out.println("===================");
                    System.out.println("INFORME DE INTENTOS");
                    System.out.println("Correctos: "+correct);
                    System.out.println("Inorrectos: "+incorrect);
                }else{
                    System.out.println(" I N C O R R E C T O");
                    incorrect++;
                }
            }
        }while(frase.length()>5 || !frase.equals("&&&&&"));
                
    }
    
}
