/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_return_sumatoria;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA3_15_RETURN_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner captu= new Scanner (System.in);
        System.out.println("Base:");
        int numero=captu.nextInt();
        
        //CALCULAR LA POTENCIA
        int resu= calcualraSum(numero);
        System.out.println("El resultado es= "+ resu);
        
    }
    //Creara na funcion que calcule la potencia de un calor entero
    public static int calcualraSum(int numero){
        //muy similar a las sumatorias
        //necesitamos un acumulador
        //suam = suma + valor;
        //suma +=valor;
        int sumamtoria=0;
        for (int i = 1; i <= numero; i++) {
            sumamtoria +=i ;
        }
        return sumamtoria;
    }
    
}
