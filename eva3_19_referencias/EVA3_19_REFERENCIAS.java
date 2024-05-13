/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_19_referencias;

/**
 *
 * @author artas
 */
public class EVA3_19_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[10];
        int x= 100;
        System.out.println("Antes de llamar al metodo="+x);
        sumarUno(x);//Le estoy enviuando una copia del valor almacenado en la x
        System.out.println("Despues de llamar al metodo.x="+x);
        System.out.println("-------------------");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println("");
        modificarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
    }
    public static void sumarUno( int valor){//recive copia del valor
        System.out.println("Antes de la operacion. Valor="+ valor);
        valor= valor+1;
        System.out.println("Despues de la operacion="+valor);
    }
    public static void modificarArreglo(int[]arreglo){//recie la direccion de la variable
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=(int)(Math.random()*100);
        }
    }
            
    
}
