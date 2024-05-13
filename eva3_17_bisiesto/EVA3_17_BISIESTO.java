/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA3_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu=new Scanner(System.in);
        System.out.println("Ingrese un año para saber si fue bisiesto:");
        int año=captu.nextInt();
        boolean resu = esBiciesto(año);
        if(resu)
            System.out.println("Si es año biciesto");
        else
            System.out.println("No es año biciesto");
    }
    public static boolean esBiciesto(int año){
        int res,res2,res3;
        res =año%4;
        res2=año%100;
        res3=año%400;
       if((res==0&&res2!=0)||res3==0)
            return true;
       else
           return false;
    }
}
