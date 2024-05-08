/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_metodos_arreglos;

/**
 *
 * @author artas
 */
public class EVA3_16_METODOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]datos =new int [10];
         datos= llenar (datos);//Mandamos el arreglo, nos lo devuelve lleno
        imprimir(datos);//imprime los valores del arreglo
        System.out.println("");
        int[]datos2 =new int [15];
        datos2= llenar (datos2);//Manda el arreglo, nos lo devuelve lleno
        imprimir(datos2);//imprime los valores del arregolo
    }
    public static void imprimir(int []arreglo){
        for(int i=0; i< arreglo.length;i++){
            System.out.print("["+arreglo[i]+"]");
        }
    }
    
    public static int[] llenar (int []arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= (int)(Math.random()*100);
    }
        return arreglo;
    }
    
}
