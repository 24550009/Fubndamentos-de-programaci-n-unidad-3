/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos;

/**
 *
 * @author artas
 */
public class EVA3_9_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diaSemana[]= {"Domingo","Lunes","Martes", "Miércoles","Juevez","Sábado",};
        
        char vocales[]= {'a','e','i','0','u'};
        System.out.println("Tamaño del arerglo diaSemana="+ diaSemana.length);
        System.out.println("Tamaño del arreglo vocales="+vocales.length);
        
        for (int i = 0; i < diaSemana.length; i++) {
            System.out.println(diaSemana[i]);
            
        }
        for (int i = 0; i < vocales.length; i++) {
            System.out.print(vocales[i]);  
        }
        System.out.println("");
        String menu[]={"Archivo","Nueva Factura","Modificar","Salir"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+"-"+menu[i]);
            
        }
    }
    
}
