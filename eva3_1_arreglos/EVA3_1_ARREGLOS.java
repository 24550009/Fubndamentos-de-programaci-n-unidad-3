/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author artas
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TENEMOS QUE CREARLOS ANTES DE USARLOS
        //[]-->manejar los indices: arreglo[3] acceso a la posicion
        //new ponerloken memoria
        //declaracion  = creacion (new)[tamaño del arreglo]
        // un enetero en java ocupa 4 baits
        int arreglo[]= new int[10];//un arreglo de 10 entereos
        //acceedmos al los datos atraves indices:
        //conocer las posiciones de los valores:
        //LA PRIMER POSICION DE UN ARREGLO ES CERO-->0
        //ULTIMA POSOCION DE UN ARREGLO ES --> N - 1, donde
        //N ES EL TAMAÑO DEL AREGLO
        arreglo[1]=100;
        System.out.println("Valor de arreglo [1]="+arreglo[1]);
        System.out.println(arreglo);
        System.out.println(arreglo.length);
    }
    
}
