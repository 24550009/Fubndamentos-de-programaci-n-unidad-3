/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_propiedades_arreglos;

/**
 *
 * @author artas
 */
public class EVA3_4_PROPIEDADES_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[]= new int[3];
        arreglo[0]=100;
        arreglo[1]=200;
        arreglo[2]=300;
        System.out.println(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
            
        }
        //------------------------
        //no se puede cambier de tamaño un arreglo
        arreglo=new int [5];
        arreglo[0]=100;
        arreglo[1]=200;
        arreglo[2]=300;
        System.out.println("");
        System.out.println(arreglo);
        System.out.println("DEPUES DEL CAMBIO DE TAMÑAO");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
    }
    
}
