/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA3_11_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diez[]=new int[10];
        //LLENARLO CON VALORES ALEATORIOS
        for (int i = 0; i < diez.length; i++) {
            diez[i]=((int)(Math.random()*100)+1);
        }
        for (int val : diez) {
            System.out.print("["+val+"]");    
        }
        //preguntar al usuario el valor a buscar
        Scanner captu= new Scanner(System.in);
        System.out.println("");
        System.out.println("¿Que valor buscas?");
        int valor= captu.nextInt();
        //BUSCAR:
        //RECORRER EL ARREGLO (CICLO FOR)
        //COMPARARA VALOR BUSCADO CONTRA AL VALOR AN AL ARREGLO(IF)
        //DETENER SI LO ENCUENTRO, SI NO, SEGUIR BUSCANDO
        //REGRESAR EL RESULTADO: PUEDE VARIAR> PUEDE SER LA POSICION
        //O VERDADERO (SI LO ENCUENTRA) O FALSO (NO,LO ENCUENTRA)
        int pos= -1;//una pocicion que no existe
        for (int i = 0; i < diez.length; i++) {
            if(valor==diez[i]){
                pos= i;
                break;
            }
            
        }
        System.out.println("Posicion ="+pos);
        }
            
        }
