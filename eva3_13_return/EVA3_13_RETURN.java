/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA3_13_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu= new Scanner (System.in);
        System.out.println("Valor 1");
        int val1=captu.nextInt();
        System.out.println("Valor 2");
        int val2=captu.nextInt();
        //LLAMAR A LA FUNCION
        //1. Gusrdar el resultado
        int resu= sumar(val1,val2);
        System.out.println("La suma es: "+ resu);
        //2. usar directamente al resultado de la funcion
        //cuando solo usan al resultado una vez
        System.out.println("La suma = "+ sumar(val1,val2));
        //3 ingnorar el resultado
        sumar(val2,val2);
    }
    public static int sumar(int num1,int num2){
        int resu= num1+num2;
        return resu; //Es la ultima instruccion del metodo
                     //despues del return sno puede haber mas
                     //instrucciones
    }
}
