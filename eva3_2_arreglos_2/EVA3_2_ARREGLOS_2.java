/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos_2;

/**
 *
 * @author artas
 */
public class EVA3_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JAVA:0 primer elemto
        //      N-1 ultimo elemto
        //N--> TOTAL DE ELMENTOS ALMACENADOS EN EL ARREGLO
        
        
        // vamos a crear un arregki y llenarlo de valores aletorios
        // int datos[], x, y, ;--> SOLO datos   ES UN ARREGLO
        //  int[ datos, x, y,;--> TODAS LAS VARIAVLES DON ARRGLOS
        int datos[]= new int[20];
        //se usas el siclo for porque sabemos la cantidad de repeticiones
        //asignar valores aleatorios entre 0 y 99(1-100 le sumamos 1)
        for (int i = 0; i < datos.length; i++) {
            datos[i]= (int)(Math.random()*100);//0ny pp
        }
        //imprimir los elementos del arreglo
        for (int i = 0; i < datos.length; i++) {
            System.out.print("["+datos[i]+"]");
        }
    }
    
}
