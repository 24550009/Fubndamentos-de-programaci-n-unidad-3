/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_metodos;

/**
 *
 * @author artas
 */
public class EVA3_12_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //invoca al método--->llamada al método-->call
        mostrarMensaje("Hola mundo cruel!!!");
        mostrarMuchosMensajes("HOLA!!", 5);
    }
    //public static----> para la materia de POO
    // void----> (tipo de dato) valor que regrresa el metodo
    //void----> no regresa nada
    //nombre del método---> identificador válido
    //                     empezar en minusculas, debes ser un verbo
    //()<-----parámetros del método(argumentos)---> valores que necesita para funcionar
    //los parentesisi son obligatorios
    //las llaves son bloques de codigo{}
    public static void mostrarMensaje(String mensaje){//encavezado (nomobre del metodo)
        //cuerpo del metodo: aqui va nuestro codigo
        System.out.println(mensaje);
    }
    public static void mostrarMuchosMensajes(String mensaje,int veces ){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
    }
}
