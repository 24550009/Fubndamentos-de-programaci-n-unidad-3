/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_for_each;

/**
 *
 * @author artas
 */
public class EVA3_10_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diaSemana[]= {"Domingo","Lunes","Martes", "Miércoles","Juevez","Sábado",};
        for (String dia : diaSemana) {//no da las posiciones
            System.out.println(dia);
            
        }
        int salario[]={100,200,300,400,500,700,800,900,1000,1200};
        for(int cant: salario)
           System.out.println("$"+cant);
            //--------------------
            //Meses del año
        String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciemmre"};
        for (String mes : meses) {
            System.out.println(mes);
        }
    }
    
}
